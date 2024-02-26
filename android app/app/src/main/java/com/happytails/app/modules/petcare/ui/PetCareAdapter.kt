package com.happytails.app.modules.petcare.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowPetCareBinding
import com.happytails.app.modules.petcare.`data`.model.PetCareRowModel
import kotlin.Int
import kotlin.collections.List

class PetCareAdapter(
  var list: List<PetCareRowModel>
) : RecyclerView.Adapter<PetCareAdapter.RowPetCareVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPetCareVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pet_care,parent,false)
    return RowPetCareVH(view)
  }

  override fun onBindViewHolder(holder: RowPetCareVH, position: Int) {
    val petCareRowModel = PetCareRowModel()
    // TODO uncomment following line after integration with data source
    // val petCareRowModel = list[position]
    holder.binding.petCareRowModel = petCareRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PetCareRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PetCareRowModel
    ) {
    }
  }

  inner class RowPetCareVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPetCareBinding = RowPetCareBinding.bind(itemView)
  }
}
