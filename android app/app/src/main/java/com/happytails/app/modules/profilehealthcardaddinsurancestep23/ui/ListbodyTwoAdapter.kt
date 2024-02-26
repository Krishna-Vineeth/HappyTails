package com.happytails.app.modules.profilehealthcardaddinsurancestep23.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowListbodyTwoBinding
import com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.model.ListbodyTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListbodyTwoAdapter(
  var list: List<ListbodyTwoRowModel>
) : RecyclerView.Adapter<ListbodyTwoAdapter.RowListbodyTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbodyTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbody_two,parent,false)
    return RowListbodyTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListbodyTwoVH, position: Int) {
    val listbodyTwoRowModel = ListbodyTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listbodyTwoRowModel = list[position]
    holder.binding.listbodyTwoRowModel = listbodyTwoRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbodyTwoRowModel>) {
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
      item: ListbodyTwoRowModel
    ) {
    }
  }

  inner class RowListbodyTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbodyTwoBinding = RowListbodyTwoBinding.bind(itemView)
  }
}
