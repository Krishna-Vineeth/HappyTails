package com.happytails.app.modules.community.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListrectangle1imThreeBinding
import com.happytails.app.modules.community.`data`.model.Listrectangle1imThreeRowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle1imThreeAdapter(
  var list: List<Listrectangle1imThreeRowModel>
) : RecyclerView.Adapter<Listrectangle1imThreeAdapter.RowListrectangle1imThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle1imThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle1im_three,parent,false)
    return RowListrectangle1imThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle1imThreeVH, position: Int) {
    val listrectangle1imThreeRowModel = Listrectangle1imThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle1imThreeRowModel = list[position]
    holder.binding.listrectangle1imThreeRowModel = listrectangle1imThreeRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle1imThreeRowModel>) {
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
      item: Listrectangle1imThreeRowModel
    ) {
    }
  }

  inner class RowListrectangle1imThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle1imThreeBinding = RowListrectangle1imThreeBinding.bind(itemView)
    init {
      binding.linearRowrectangle1imThree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectangle1imThreeRowModel())
      }
    }
  }
}
