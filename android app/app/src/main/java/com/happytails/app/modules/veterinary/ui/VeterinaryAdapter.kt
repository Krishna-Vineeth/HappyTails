package com.happytails.app.modules.veterinary.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowVeterinaryBinding
import com.happytails.app.modules.veterinary.`data`.model.VeterinaryRowModel
import kotlin.Int
import kotlin.collections.List

class VeterinaryAdapter(
  var list: List<VeterinaryRowModel>
) : RecyclerView.Adapter<VeterinaryAdapter.RowVeterinaryVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowVeterinaryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_veterinary,parent,false)
    return RowVeterinaryVH(view)
  }

  override fun onBindViewHolder(holder: RowVeterinaryVH, position: Int) {
    val veterinaryRowModel = VeterinaryRowModel()
    // TODO uncomment following line after integration with data source
    // val veterinaryRowModel = list[position]
    holder.binding.veterinaryRowModel = veterinaryRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<VeterinaryRowModel>) {
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
      item: VeterinaryRowModel
    ) {
    }
  }

  inner class RowVeterinaryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowVeterinaryBinding = RowVeterinaryBinding.bind(itemView)
  }
}
