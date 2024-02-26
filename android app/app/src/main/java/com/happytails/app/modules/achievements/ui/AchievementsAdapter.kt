package com.happytails.app.modules.achievements.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowAchievementsBinding
import com.happytails.app.modules.achievements.`data`.model.AchievementsRowModel
import kotlin.Int
import kotlin.collections.List

class AchievementsAdapter(
  var list: List<AchievementsRowModel>
) : RecyclerView.Adapter<AchievementsAdapter.RowAchievementsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAchievementsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_achievements,parent,false)
    return RowAchievementsVH(view)
  }

  override fun onBindViewHolder(holder: RowAchievementsVH, position: Int) {
    val achievementsRowModel = AchievementsRowModel()
    // TODO uncomment following line after integration with data source
    // val achievementsRowModel = list[position]
    holder.binding.achievementsRowModel = achievementsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AchievementsRowModel>) {
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
      item: AchievementsRowModel
    ) {
    }
  }

  inner class RowAchievementsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAchievementsBinding = RowAchievementsBinding.bind(itemView)
  }
}
