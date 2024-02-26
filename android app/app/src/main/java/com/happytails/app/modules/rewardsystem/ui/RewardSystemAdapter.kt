package com.happytails.app.modules.rewardsystem.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happytails.app.R
import com.happytails.app.databinding.RowRewardSystemBinding
import com.happytails.app.modules.rewardsystem.`data`.model.RewardSystemRowModel
import kotlin.Int
import kotlin.collections.List

class RewardSystemAdapter(
  var list: List<RewardSystemRowModel>
) : RecyclerView.Adapter<RewardSystemAdapter.RowRewardSystemVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRewardSystemVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_reward_system,parent,false)
    return RowRewardSystemVH(view)
  }

  override fun onBindViewHolder(holder: RowRewardSystemVH, position: Int) {
    val rewardSystemRowModel = RewardSystemRowModel()
    // TODO uncomment following line after integration with data source
    // val rewardSystemRowModel = list[position]
    holder.binding.rewardSystemRowModel = rewardSystemRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RewardSystemRowModel>) {
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
      item: RewardSystemRowModel
    ) {
    }
  }

  inner class RowRewardSystemVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRewardSystemBinding = RowRewardSystemBinding.bind(itemView)
  }
}
