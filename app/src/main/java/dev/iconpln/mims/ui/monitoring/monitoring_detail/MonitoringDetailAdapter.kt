package dev.iconpln.mims.ui.monitoring.monitoring_detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.iconpln.mims.data.local.database.TPos
import dev.iconpln.mims.data.local.database.TPosDetail
import dev.iconpln.mims.databinding.ItemDataDetailPurchaseOrderBinding
import dev.iconpln.mims.databinding.ItemDataMonitoringPurchaseBinding

class MonitoringDetailAdapter(val lisModels: MutableList<TPosDetail>, var listener: OnAdapterListener)
    : RecyclerView.Adapter<MonitoringDetailAdapter.ViewHolder>() {

    fun setPoList(po: List<TPosDetail>){
        lisModels.clear()
        lisModels.addAll(po)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MonitoringDetailAdapter.ViewHolder {
        val binding = ItemDataDetailPurchaseOrderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonitoringDetailAdapter.ViewHolder, position: Int) {
        holder.bind(lisModels[position])
    }

    override fun getItemCount(): Int = lisModels.size

    inner class ViewHolder(val binding: ItemDataDetailPurchaseOrderBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(po : TPosDetail){
            with(binding){
                txtKuantitas.text = po.qty
                txtUnit.text = po.uom
                txtDeliveryDate.text = po.createdDate
                txtLeadTime.text = po.leadTime
                txtPlant.text = po.plantName
                txtNoMaterial.text = po.noMatSap
                txtStatus.text = po.doStatus
                txtStoreloc.text = po.storLoc
            }

            itemView.setOnClickListener { listener.onClick(po) }
        }
    }

    interface OnAdapterListener{
        fun onClick(po: TPosDetail)
    }
}