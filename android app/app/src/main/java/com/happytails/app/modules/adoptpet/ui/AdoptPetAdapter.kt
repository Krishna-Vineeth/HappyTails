package com.happytails.app.modules.adoptpet.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowAdoptPetBinding
import com.happytails.app.modules.adoptpet.`data`.model.AdoptPetRowModel
import kotlin.Int
import kotlin.collections.List

class AdoptPetAdapter(
  var list: List<AdoptPetRowModel>
) : RecyclerView.Adapter<AdoptPetAdapter.RowAdoptPetVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAdoptPetVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_adopt_pet,parent,false)
    return RowAdoptPetVH(view)
  }

  override fun onBindViewHolder(holder: RowAdoptPetVH, position: Int) {
    val adoptPetRowModel = AdoptPetRowModel()
    // TODO uncomment following line after integration with data source
    // val adoptPetRowModel = list[position]
    holder.binding.adoptPetRowModel = adoptPetRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AdoptPetRowModel>) {
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
      item: AdoptPetRowModel
    ) {
    }
  }

  inner class RowAdoptPetVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAdoptPetBinding = RowAdoptPetBinding.bind(itemView)
    init {
      binding.txtGroupSeven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, AdoptPetRowModel())
      }
      binding.txtGroupSevenOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, AdoptPetRowModel())
      }
    }
  }
}
