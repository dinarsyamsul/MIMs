package dev.iconpln.mims.ui.pnerimaan.input_petugas

import android.Manifest
import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import dev.iconpln.mims.AddPhotoAdapter
import dev.iconpln.mims.CameraXActivity
import dev.iconpln.mims.MyApplication
import dev.iconpln.mims.R
import dev.iconpln.mims.data.local.database.*
import dev.iconpln.mims.data.local.database_local.GenericReport
import dev.iconpln.mims.data.local.database_local.ReportParameter
import dev.iconpln.mims.data.local.database_local.ReportUploader
import dev.iconpln.mims.data.remote.service.ApiConfig
import dev.iconpln.mims.databinding.ActivityInputPetugasPenerimaanBinding
import dev.iconpln.mims.tasks.Loadable
import dev.iconpln.mims.tasks.TambahReportTask
import dev.iconpln.mims.ui.pemeriksaan.PemeriksaanViewModel
import dev.iconpln.mims.ui.pnerimaan.PenerimaanActivity
import dev.iconpln.mims.utils.*
import org.joda.time.DateTime
import org.joda.time.LocalDateTime
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

class InputPetugasPenerimaanActivity : AppCompatActivity(), Loadable {
    private lateinit var binding: ActivityInputPetugasPenerimaanBinding
    private lateinit var daoSession: DaoSession
    private val viewModel: PemeriksaanViewModel by viewModels()
    private lateinit var cal: Calendar
    private lateinit var listPhoto: List<TPhoto>
    private lateinit var dataPen: TPosPenerimaan
    private lateinit var adapter: AddPhotoAdapter
    var pemeriksaan = TPemeriksaan()
    private val cameraRequestFoto = 101
    private val galleryRequestFoto = 102
    private var noDo: String? = ""
    private var photoNumber: Int = 0
    private var tglTerima: String? = ""
    private var progressDialog: AlertDialog? = null
    private var role = 0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputPetugasPenerimaanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        daoSession = (application as MyApplication).daoSession!!

        cal = Calendar.getInstance()
        noDo = intent.getStringExtra("noDo")
        role = SharedPrefsUtils.getIntegerPreference(this@InputPetugasPenerimaanActivity, "roleId",0)

        listPhoto = daoSession.tPhotoDao.queryBuilder()
            .where(TPhotoDao.Properties.NoDo.eq(noDo))
            .where(TPhotoDao.Properties.Type.eq("input penerima"))
            .list()

        dataPen = daoSession.tPosPenerimaanDao.queryBuilder()
            .where(TPosPenerimaanDao.Properties.NoDoSmar.eq(noDo))
            .limit(1).unique()

        photoNumber = listPhoto.size + 1

        adapter = AddPhotoAdapter(arrayListOf(), object : AddPhotoAdapter.OnAdapterListener{
            override fun onClick(po: TPhoto) {
                if (po.photoNumber == 5){
                    Toast.makeText(this@InputPetugasPenerimaanActivity, "Anda sudah melebihi batas upload foto", Toast.LENGTH_SHORT).show()
                }else{
                    doFoto()
                }
            }

        }, dataPen.tanggalDiterima.isNullOrEmpty(),
            object : AddPhotoAdapter.OnAdapterListenerDelete{
                override fun onClick(po: TPhoto) {
                    val delete = daoSession.tPhotoDao.queryBuilder()
                        .where(TPhotoDao.Properties.Id.eq(po.id)).list().get(0)
                    daoSession.tPhotoDao.delete(delete)

                    val newList = daoSession.tPhotoDao.queryBuilder()
                        .where(TPhotoDao.Properties.NoDo.eq(noDo))
                        .where(TPhotoDao.Properties.Type.eq("input penerima"))
                        .list()

                    adapter.setPhotoList(newList)
                    photoNumber--

                    if (newList.isEmpty()){
                        binding.btnUploadPhoto.visibility = View.VISIBLE
                        binding.maksfoto.visibility = View.VISIBLE
                    }else {
                        binding.btnUploadPhoto.visibility = View.GONE
                        binding.maksfoto.visibility = View.GONE
                    }
                }

            })

        adapter.setPhotoList(listPhoto)

        with(binding){
            btnBack.setOnClickListener { onBackPressed() }

            if (!dataPen.tanggalDiterima.isNullOrEmpty()){
                btnSimpan.visibility = View.GONE
                edtTanggalDiterima.isEnabled = false
                edtEkspedisi.isFocusable = false
                edtPetugasPenerima.isFocusable = false
                edtNamaKurir.isFocusable = false
            }

            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            val currentDate = LocalDate.now().format(formatter)

            edtTanggalDiterima.setText(if (dataPen.tanggalDiterima.isNullOrEmpty()) currentDate else dataPen.tanggalDiterima)
            edtPetugasPenerima.setText("${dataPen.petugasPenerima}")

            if (dataPen.expeditions.isNullOrEmpty()) edtEkspedisi.setText("JNE") else edtEkspedisi.setText("${dataPen.expeditions}")

            if (dataPen.kurirPengantar.isNullOrEmpty()) edtNamaKurir.setText("") else edtNamaKurir.setText("${dataPen.kurirPengantar}")

            if (listPhoto.isEmpty()){
                btnUploadPhoto.visibility = View.VISIBLE
                maksfoto.visibility = View.VISIBLE
            }else {
                btnUploadPhoto.visibility = View.GONE
                maksfoto.visibility = View.GONE
            }

            btnUploadPhoto.setOnClickListener {
                doFoto()
            }

            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val myFormat = "yyyy-MM-dd" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                tglTerima = sdf.format(cal.time)
                binding.edtTanggalDiterima.setText(sdf.format(cal.time))

            }

            edtTanggalDiterima.setOnClickListener{
                DatePickerDialog(this@InputPetugasPenerimaanActivity, dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }

            btnSimpan.setOnClickListener { validation() }

            rvAddFoto.adapter = adapter
            rvAddFoto.layoutManager = LinearLayoutManager(this@InputPetugasPenerimaanActivity, LinearLayoutManager.VERTICAL, false)
            rvAddFoto.setHasFixedSize(true)

            if (role == 10){
                btnSimpan.isEnabled = false
                btnUploadPhoto.visibility = View.GONE
                btnSimpan.setBackgroundColor(Color.GRAY)

                lblFotoSuratBarang.visibility = View.GONE
                rvAddFoto.visibility = View.GONE
                maksfoto.visibility = View.GONE
            }
        }
    }

    private fun doFoto() {
        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this@InputPetugasPenerimaanActivity, arrayOf(
                Manifest.permission.CAMERA), cameraRequestFoto)

        val dialog = BottomSheetDialog(this@InputPetugasPenerimaanActivity, R.style.AppBottomSheetDialogTheme)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog_photo, null)
        var btnCamera = view.findViewById<CardView>(R.id.cv_kamera)
        var btnGallery = view.findViewById<CardView>(R.id.cv_gallery)

        btnCamera.setOnClickListener {
//                    val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                    startActivityForResult(cameraIntent, cameraRequestFotoSuratBarang)
            val intent = Intent(this@InputPetugasPenerimaanActivity, CameraXActivity::class.java)
                .putExtra("fotoName", "fotoPemeriksaan")
            startActivityForResult(intent,cameraRequestFoto)
            dialog.dismiss()
        }

        btnGallery.setOnClickListener {
            val photoPickerIntent = Intent(Intent.ACTION_PICK)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, galleryRequestFoto)
            dialog.dismiss()
        }

        dialog.setCancelable(true)
        dialog.setContentView(view)
        dialog.show()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun validation() {
        with(binding){
            val tglDiterima = edtTanggalDiterima.text.toString()
            val petugasPenerima = edtPetugasPenerima.text.toString()
            val namaKurir = edtNamaKurir.text.toString()
            val namaEkspedisi = edtEkspedisi.text.toString()

            if (tglDiterima.isNullOrEmpty()){
                Toast.makeText(this@InputPetugasPenerimaanActivity, "Lengkapi setiap data yang akan di inputkan", Toast.LENGTH_SHORT).show()
                return
            }

            if (petugasPenerima.isNullOrEmpty()){
                Toast.makeText(this@InputPetugasPenerimaanActivity, "Lengkapi setiap data yang akan di inputkan", Toast.LENGTH_SHORT).show()
                return
            }

            if (namaKurir.isNullOrEmpty()){
                Toast.makeText(this@InputPetugasPenerimaanActivity, "Lengkapi setiap data yang akan di inputkan", Toast.LENGTH_SHORT).show()
                return
            }

            if (namaEkspedisi.isNullOrEmpty()){
                Toast.makeText(this@InputPetugasPenerimaanActivity, "Lengkapi setiap data yang akan di inputkan", Toast.LENGTH_SHORT).show()
                return
            }

            if (listPhoto.isEmpty()){
                Toast.makeText(this@InputPetugasPenerimaanActivity, "Silahkan ambil foto terlebih dahulu", Toast.LENGTH_SHORT).show()
                return
            }

            insertData(tglDiterima,petugasPenerima,namaKurir,namaEkspedisi)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun insertData(
        tglDiterima: String,
        petugasPenerima: String,
        namaKurir: String,
        namaEkspedisi: String
    ) {
        val noPenerimaan = "PEN${noDo}${DateTimeUtils.currentUtcString}"
        dataPen.tanggalDiterima = tglDiterima
        dataPen.petugasPenerima = petugasPenerima
        dataPen.kurirPengantar = namaKurir

        dataPen.isDone = 0

        daoSession.update(dataPen)

        val dialog = Dialog(this@InputPetugasPenerimaanActivity)
        dialog.setContentView(R.layout.popup_penerimaan);
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.window!!.attributes.windowAnimations = R.style.DialogUpDown;
        val btnOk = dialog.findViewById(R.id.btn_ok) as AppCompatButton

        btnOk.setOnClickListener {
            dialog.dismiss();
            submitForm(tglDiterima,petugasPenerima,namaKurir)
            insertDefaultRating()
            insertDataAwalPenerimaanAkhir()
        }

        dialog.show();
    }

    private fun insertDataAwalPenerimaanAkhir() {
        val dataPenerimaanAkhir = daoSession.tPosDetailPenerimaanAkhirDao.queryBuilder()
            .where(TPosDetailPenerimaanAkhirDao.Properties.NoDoSmar.eq(noDo)).list()

        if (dataPenerimaanAkhir.isNullOrEmpty()){
            val listDos = daoSession.tPosSnsDao.queryBuilder()
                .where(TPosSnsDao.Properties.NoDoSmar.eq(noDo)).list()
            val size = listDos.size
            if (size > 0) {
                val items = arrayOfNulls<TPosDetailPenerimaanAkhir>(size)
                var item: TPosDetailPenerimaanAkhir
                for ((i, model) in listDos.withIndex()){
                    item = TPosDetailPenerimaanAkhir()
                    item.storLoc = model.storLoc
                    item.serialNumber = model.noSerial
                    item.isComplaint = false
                    item.kdPabrikan = model.kdPabrikan
                    item.isReceived = false
                    item.noPackaging = model.noPackaging
                    item.noMaterial = model.noMatSap
                    item.namaKategoriMaterial = model.namaKategoriMaterial
                    item.isRejected = false
                    item.qty = size.toString()
                    item.noDoSmar = model.noDoSmar
                    items[i] = item
                }
                daoSession.tPosDetailPenerimaanAkhirDao.insertInTx(items.toList())
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun insertDefaultRating() {
        val poDate = dataPen.poDate
        val leadTime = dataPen.leadTime
        val tglSerahTerima = tglTerima
        val ratingResponse = 0
        val ratingQuality = 0

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val startDate = LocalDate.parse(poDate, formatter)
        val endDate = LocalDate.parse(tglSerahTerima, formatter)
        val diffInDays = ChronoUnit.DAYS.between(startDate, endDate)

        if (leadTime - diffInDays > 0L){
            val ratingDelivery = 25

            val tTransDataRating = TTransDataRating()
            tTransDataRating.ratingDelivery = ratingDelivery.toString()
            tTransDataRating.ratingQuality = ratingQuality.toString()
            tTransDataRating.ratingResponse = ratingResponse.toString()
            tTransDataRating.noDoSmar = noDo
            tTransDataRating.ketepatan = 0
            tTransDataRating.selesaiRating = false
            tTransDataRating.isDone = 0
            daoSession.tTransDataRatingDao.insert(tTransDataRating)
        }else if (leadTime - diffInDays == 0L){
            val ratingDelivery = 24

            val tTransDataRating = TTransDataRating()
            tTransDataRating.ratingDelivery = ratingDelivery.toString()
            tTransDataRating.ratingQuality = ratingQuality.toString()
            tTransDataRating.ratingResponse = ratingResponse.toString()
            tTransDataRating.noDoSmar = noDo
            tTransDataRating.ketepatan = 0
            tTransDataRating.selesaiRating = false
            tTransDataRating.isDone = 0
            daoSession.tTransDataRatingDao.insert(tTransDataRating)
        }else if (leadTime - diffInDays < 0L){
            val ratingDelivery = 0

            val tTransDataRating = TTransDataRating()
            tTransDataRating.ratingDelivery = ratingDelivery.toString()
            tTransDataRating.ratingQuality = ratingQuality.toString()
            tTransDataRating.ratingResponse = ratingResponse.toString()
            tTransDataRating.noDoSmar = noDo
            tTransDataRating.ketepatan = 0
            tTransDataRating.selesaiRating = false
            tTransDataRating.isDone = 0
            daoSession.tTransDataRatingDao.insert(tTransDataRating)
        }else{
            val ratingDelivery = 0

            val tTransDataRating = TTransDataRating()
            tTransDataRating.ratingDelivery = ratingDelivery.toString()
            tTransDataRating.ratingQuality = ratingQuality.toString()
            tTransDataRating.ratingResponse = ratingResponse.toString()
            tTransDataRating.noDoSmar = noDo
            tTransDataRating.ketepatan = 0
            tTransDataRating.selesaiRating = false
            tTransDataRating.isDone = 0
            daoSession.tTransDataRatingDao.insert(tTransDataRating)
        }
    }

    private fun submitForm(tglDiterima: String, petugasPenerima: String, namaKurir: String) {
        val reports = ArrayList<GenericReport>()
        val currentDate = LocalDateTime.now().toString(Config.DATE)
        val currentDateTime = LocalDateTime.now().toString(Config.DATETIME)
        val currentUtc = DateTimeUtils.currentUtc
        Log.i("datime","${currentDateTime}")

        //region Add report visit to queue
        var jwt = SharedPrefsUtils.getStringPreference(this@InputPetugasPenerimaanActivity,"jwt","")
        Log.d("nih jwt nya",jwt.toString())
        var username = SharedPrefsUtils.getStringPreference(this@InputPetugasPenerimaanActivity, "username","14.Hexing_Electrical")
        val reportId = "temp_penerimaan" + username + "_" + noDo + "_" + DateTime.now().toString(Config.DATETIME)
        val reportName = "Update Data Penerimaan"
        val reportDescription = "$reportName: "+ " (" + reportId + ")"
        val params = ArrayList<ReportParameter>()
        params.add(ReportParameter("1", reportId, "no_do_smar", noDo!!, ReportParameter.TEXT))
        params.add(ReportParameter("2", reportId, "tgl_terima", tglDiterima, ReportParameter.TEXT))
        params.add(ReportParameter("3", reportId, "petugas_penerima", petugasPenerima, ReportParameter.TEXT))
        params.add(ReportParameter("4", reportId, "nama_kurir", namaKurir, ReportParameter.TEXT))
        params.add(ReportParameter("5", reportId, "nama_ekspedisi", "JNE", ReportParameter.TEXT))
        params.add(ReportParameter("6", reportId, "username", username!!, ReportParameter.TEXT))
        params.add(ReportParameter("7", reportId, "email", username, ReportParameter.TEXT))

        var i = 1
        var reportParameter = 8
        for (j in listPhoto){
            params.add(ReportParameter(reportParameter.toString(), reportId, "photos$i", j.path, ReportParameter.FILE))
            i++
            reportParameter++
        }

        val report = GenericReport(reportId, jwt!!, reportName, reportDescription, ApiConfig.sendPenerimaanPerson(), currentDate, Config.NO_CODE, currentUtc, params)
        reports.add(report)
        //endregion

        val task = TambahReportTask(this, reports)
        task.execute()

        val iService = Intent(applicationContext, ReportUploader::class.java)
        startService(iService)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK && requestCode == galleryRequestFoto){
            val imageUri = data?.data
            val imageStream = contentResolver.openInputStream(imageUri!!)
            val bitmap: Bitmap = BitmapFactory.decodeStream(imageStream)

            val file_path = StorageUtils.getDirectory(StorageUtils.DIRECTORY_ROOT) +
                    "/Images"
            val dir = File(file_path)
            if (!dir.exists()) dir.mkdirs()
            val file = File(dir, "mims" + "picturesFotoPetugasPenerimaan${UUID.randomUUID()}" + ".png")
            val fOut = FileOutputStream(file)

            bitmap.compress(Bitmap.CompressFormat.PNG, 60, fOut)
            fOut.flush()
            fOut.close()

            Log.d("size fotonya", file.length().toString())

            insertDataFoto(file)
        }else{
            Log.d("cancel", "cacelPhoto")
        }

        if (resultCode == RESULT_OK && requestCode == cameraRequestFoto){
            val mPhotoPath = data?.getStringExtra("Path")

            var photo = TPhoto()
            photo.noDo = noDo
            photo.type = "input penerima"
            photo.path = mPhotoPath
            photo.photoNumber = photoNumber++
            daoSession.tPhotoDao.insert(photo)

            listPhoto = daoSession.tPhotoDao.queryBuilder()
                .where(TPhotoDao.Properties.NoDo.eq(noDo))
                .where(TPhotoDao.Properties.Type.eq("input penerima"))
                .list()

            if (listPhoto.isEmpty()){
                binding.btnUploadPhoto.visibility = View.VISIBLE
                binding.maksfoto.visibility = View.VISIBLE
            }else {
                binding.btnUploadPhoto.visibility = View.GONE
                binding.maksfoto.visibility = View.GONE
            }

            adapter.setPhotoList(listPhoto)
        }else{
            Log.d("cancel", "cacelPhoto")
        }
    }

    private fun insertDataFoto(file: File) {

        if (file.length() > Config.MAX_PHOTO_SIZE){
            Toast.makeText(this@InputPetugasPenerimaanActivity, "Ukuran foto tidak boleh melebihi 200 kb", Toast.LENGTH_SHORT).show()
            return
        }

        var photo = TPhoto()
        photo.noDo = noDo
        photo.type = "input penerima"
        photo.path = file.toString()
        photo.photoNumber = photoNumber++
        daoSession.tPhotoDao.insert(photo)

        listPhoto = daoSession.tPhotoDao.queryBuilder()
            .where(TPhotoDao.Properties.NoDo.eq(noDo))
            .where(TPhotoDao.Properties.Type.eq("input penerima"))
            .list()

        if (listPhoto.isEmpty()){
            binding.btnUploadPhoto.visibility = View.VISIBLE
            binding.maksfoto.visibility = View.VISIBLE
        }else {
            binding.btnUploadPhoto.visibility = View.GONE
            binding.maksfoto.visibility = View.GONE
        }
        adapter.setPhotoList(listPhoto)
    }

    override fun onBackPressed() {
        if (dataPen.tanggalDiterima.isNullOrEmpty()){
            val dialog = Dialog(this@InputPetugasPenerimaanActivity)
            dialog.setContentView(R.layout.popup_validation);
            dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.setCancelable(false);
            dialog.window!!.attributes.windowAnimations = R.style.DialogUpDown;
            val btnYa = dialog.findViewById(R.id.btn_ya) as AppCompatButton
            val btnTidak = dialog.findViewById(R.id.btn_tidak) as AppCompatButton
            val message = dialog.findViewById(R.id.message) as TextView
            val txtMessage = dialog.findViewById(R.id.txt_message) as TextView
            val icon = dialog.findViewById(R.id.imageView11) as ImageView

            message.text = "Yakin untuk keluar?"
            txtMessage.text = "Jika keluar setiap perubahan tidak akan tersimpan"
            icon.setImageResource(R.drawable.ic_warning)

            btnYa.setOnClickListener {
                dialog.dismiss();

                if (listPhoto.isNotEmpty()){
                    daoSession.tPhotoDao.deleteInTx(listPhoto)
                }

                startActivity(Intent(this@InputPetugasPenerimaanActivity, PenerimaanActivity::class.java )
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
                finish()
            }

            btnTidak.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show();
        }else{
            super.onBackPressed()
        }
    }

    override fun setLoading(show: Boolean, title: String, message: String) {
        try {
            if (progressDialog != null){
                if (show) {
                    progressDialog!!.apply { show() }
                } else {
                    progressDialog!!.dismiss()
                }
            }

        } catch (e: Exception) {
            progressDialog!!.dismiss()
            e.printStackTrace()
        }
    }

    override fun setFinish(result: Boolean, message: String) {
        if (result) {
            Log.i("finish","Yes")
        }
        startActivity(Intent(this@InputPetugasPenerimaanActivity, PenerimaanActivity::class.java )
            .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        finish()
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}