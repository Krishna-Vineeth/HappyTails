package com.happytails.app.modules.rewardverification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListlightbodyBinding
import com.happytails.app.modules.rewardverification.`data`.model.ListlightbodyRowModel
import kotlin.Int
import kotlin.collections.List

class ListlightbodyAdapter(
  var list: List<ListlightbodyRowModel>
) : RecyclerView.Adapter<ListlightbodyAdapter.RowListlightbodyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlightbodyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlightbody,parent,false)
    return RowListlightbodyVH(view)
  }

  override fun onBindViewHolder(holder: RowListlightbodyVH, position: Int) {
    val listlightbodyRowModel = ListlightbodyRowModel()
    // TODO uncomment following line after integration with data source
    // val listlightbodyRowModel = list[position]
    holder.binding.listlightbodyRowModel = listlightbodyRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlightbodyRowModel>) {
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
      item: ListlightbodyRowModel
    ) {
    }
  }

  inner class RowListlightbodyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlightbodyBinding = RowListlightbodyBinding.bind(itemView)
  }
}
