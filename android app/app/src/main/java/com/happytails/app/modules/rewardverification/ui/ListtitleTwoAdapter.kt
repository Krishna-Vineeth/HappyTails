package com.happytails.app.modules.rewardverification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListtitleTwo1Binding
import com.happytails.app.modules.rewardverification.`data`.model.ListtitleTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleTwoAdapter(
  var list: List<ListtitleTwo1RowModel>
) : RecyclerView.Adapter<ListtitleTwoAdapter.RowListtitleTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleTwo1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle_two1,parent,false)
    return RowListtitleTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtitleTwo1VH, position: Int) {
    val listtitleTwo1RowModel = ListtitleTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtitleTwo1RowModel = list[position]
    holder.binding.listtitleTwo1RowModel = listtitleTwo1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtitleTwo1RowModel>) {
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
      item: ListtitleTwo1RowModel
    ) {
    }
  }

  inner class RowListtitleTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitleTwo1Binding = RowListtitleTwo1Binding.bind(itemView)
  }
}
