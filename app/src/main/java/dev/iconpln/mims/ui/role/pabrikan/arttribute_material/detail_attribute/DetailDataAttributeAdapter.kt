package dev.iconpln.mims.ui.role.pabrikan.arttribute_material.detail_attribute

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.iconpln.mims.data.local.database.TMaterial
import dev.iconpln.mims.data.local.database.TMaterialDetail
import dev.iconpln.mims.databinding.ItemDataDetailMaterialPabrikanBinding
import dev.iconpln.mims.databinding.ItemDataMaterialPabrikanBinding

class DetailDataAttributeAdapter(val lisModels: MutableList<TMaterialDetail>, var listener: OnAdapterListener)
    : RecyclerView.Adapter<DetailDataAttributeAdapter.ViewHolder>() {

    fun setMaterialList(mat: List<TMaterialDetail>){
        lisModels.clear()
        lisModels.addAll(mat)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemDataDetailMaterialPabrikanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lisModels[position])
    }

    override fun getItemCount(): Int = lisModels.size

    inner class ViewHolder(val binding: ItemDataDetailMaterialPabrikanBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(mat : TMaterialDetail){
            with(binding){
                txtSerialNumber.text = mat.noProduksi
                txtNoMaterial.text = mat.nomorMaterial
                txtGaransi.text = mat.masaGaransi
                txtKategori.text = mat.namaKategoriMaterial
                txtMetrologi.text = mat.nomorSertMaterologi
                txtSpesifikasi.text = mat.spesifikasi
                txtNoPackaging.text = mat.noPackaging
                txtSpln.text = mat.spln
                txtTglProduksi.text = mat.tglProduksi
            }

            itemView.setOnClickListener { listener.onClick(mat) }
        }
    }

    interface OnAdapterListener{
        fun onClick(po: TMaterialDetail)
    }
}