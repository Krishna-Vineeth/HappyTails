package com.happytails.app.modules.donationinsidescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListrectangleseventyBinding
import com.happytails.app.modules.donationinsidescreen.`data`.model.ListrectangleseventyRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleseventyAdapter(
  var list: List<ListrectangleseventyRowModel>
) : RecyclerView.Adapter<ListrectangleseventyAdapter.RowListrectangleseventyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleseventyVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleseventy,parent,false)
    return RowListrectangleseventyVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleseventyVH, position: Int) {
    val listrectangleseventyRowModel = ListrectangleseventyRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleseventyRowModel = list[position]
    holder.binding.listrectangleseventyRowModel = listrectangleseventyRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleseventyRowModel>) {
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
      item: ListrectangleseventyRowModel
    ) {
    }
  }

  inner class RowListrectangleseventyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleseventyBinding = RowListrectangleseventyBinding.bind(itemView)
  }
}
