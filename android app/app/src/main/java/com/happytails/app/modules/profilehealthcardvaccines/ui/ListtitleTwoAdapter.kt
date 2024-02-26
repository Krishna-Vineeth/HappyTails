package com.happytails.app.modules.profilehealthcardvaccines.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListtitleTwoBinding
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ListtitleTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleTwoAdapter(
  var list: List<ListtitleTwoRowModel>
) : RecyclerView.Adapter<ListtitleTwoAdapter.RowListtitleTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle_two,parent,false)
    return RowListtitleTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListtitleTwoVH, position: Int) {
    val listtitleTwoRowModel = ListtitleTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listtitleTwoRowModel = list[position]
    holder.binding.listtitleTwoRowModel = listtitleTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtitleTwoRowModel>) {
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
      item: ListtitleTwoRowModel
    ) {
    }
  }

  inner class RowListtitleTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitleTwoBinding = RowListtitleTwoBinding.bind(itemView)
  }
}
