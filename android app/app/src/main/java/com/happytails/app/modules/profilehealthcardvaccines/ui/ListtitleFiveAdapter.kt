package com.happytails.app.modules.profilehealthcardvaccines.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListtitleFiveBinding
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ListtitleFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleFiveAdapter(
  var list: List<ListtitleFiveRowModel>
) : RecyclerView.Adapter<ListtitleFiveAdapter.RowListtitleFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleFiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitle_five,parent,false)
    return RowListtitleFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListtitleFiveVH, position: Int) {
    val listtitleFiveRowModel = ListtitleFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listtitleFiveRowModel = list[position]
    holder.binding.listtitleFiveRowModel = listtitleFiveRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtitleFiveRowModel>) {
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
      item: ListtitleFiveRowModel
    ) {
    }
  }

  inner class RowListtitleFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitleFiveBinding = RowListtitleFiveBinding.bind(itemView)
  }
}
