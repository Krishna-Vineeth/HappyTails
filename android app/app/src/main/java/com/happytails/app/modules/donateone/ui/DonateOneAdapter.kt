package com.happytails.app.modules.donateone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowDonateOneBinding
import com.happytails.app.modules.donateone.`data`.model.DonateOneRowModel
import kotlin.Int
import kotlin.collections.List

class DonateOneAdapter(
  var list: List<DonateOneRowModel>
) : RecyclerView.Adapter<DonateOneAdapter.RowDonateOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDonateOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_donate_one,parent,false)
    return RowDonateOneVH(view)
  }

  override fun onBindViewHolder(holder: RowDonateOneVH, position: Int) {
    val donateOneRowModel = DonateOneRowModel()
    // TODO uncomment following line after integration with data source
    // val donateOneRowModel = list[position]
    holder.binding.donateOneRowModel = donateOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DonateOneRowModel>) {
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
      item: DonateOneRowModel
    ) {
    }
  }

  inner class RowDonateOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDonateOneBinding = RowDonateOneBinding.bind(itemView)
    init {
      binding.linearRowrectangleseventy.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DonateOneRowModel())
      }
    }
  }
}
