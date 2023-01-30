package dev.iconpln.mims.ui.pengiriman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.iconpln.mims.MyApplication
import dev.iconpln.mims.data.local.database.DaoSession
import dev.iconpln.mims.data.local.database.TPos
import dev.iconpln.mims.databinding.ActivityPengirimanBinding

class PengirimanActivity : AppCompatActivity() {
    private lateinit var rvAdapter: ListPengirimanAdapter
    private lateinit var binding: ActivityPengirimanBinding
    private lateinit var daoSession: DaoSession

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        daoSession = (application as MyApplication).daoSession!!

        rvAdapter = ListPengirimanAdapter(arrayListOf(), object: ListPengirimanAdapter.OnAdapterListener {
            override fun onClick(po: TPos) {
                val intent = Intent(this@PengirimanActivity, DetailPengirimanActivity::class.java)
                intent.putExtra(DetailPengirimanActivity.EXTRA_NO_PENGIRIMAN, po.noDoSmar)
                startActivity(intent)
            }
        })

        binding.rvPengiriman.apply {
            adapter = rvAdapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@PengirimanActivity)
        }

        fetchDataLocal()
    }

    private fun fetchDataLocal() {
        val listDataPengiriman = daoSession.tPosDao.queryBuilder().list()
        rvAdapter.setPengirimanList(listDataPengiriman)
    }
}