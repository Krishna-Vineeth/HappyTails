package com.happytails.app.modules.community.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListrectangle1imBinding
import com.happytails.app.modules.community.`data`.model.Listrectangle1imRowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle1imAdapter(
  var list: List<Listrectangle1imRowModel>
) : RecyclerView.Adapter<Listrectangle1imAdapter.RowListrectangle1imVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle1imVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle1im,parent,false)
    return RowListrectangle1imVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle1imVH, position: Int) {
    val listrectangle1imRowModel = Listrectangle1imRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle1imRowModel = list[position]
    holder.binding.listrectangle1imRowModel = listrectangle1imRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle1imRowModel>) {
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
      item: Listrectangle1imRowModel
    ) {
    }
  }

  inner class RowListrectangle1imVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle1imBinding = RowListrectangle1imBinding.bind(itemView)
    init {
      binding.linearRowrectangle1im.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectangle1imRowModel())
      }
    }
  }
}
