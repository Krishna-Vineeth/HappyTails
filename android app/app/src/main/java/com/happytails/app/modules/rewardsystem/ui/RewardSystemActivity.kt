package com.happytails.app.modules.rewardsystem.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityRewardSystemBinding
import com.happytails.app.modules.achievements.ui.AchievementsActivity
import com.happytails.app.modules.rewardgranted.ui.RewardGrantedActivity
import com.happytails.app.modules.rewardsystem.`data`.model.RewardSystemRowModel
import com.happytails.app.modules.rewardsystem.`data`.viewmodel.RewardSystemVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RewardSystemActivity :
    BaseActivity<ActivityRewardSystemBinding>(R.layout.activity_reward_system) {
  private val viewModel: RewardSystemVM by viewModels<RewardSystemVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val rewardSystemAdapter =
    RewardSystemAdapter(viewModel.rewardSystemList.value?:mutableListOf())
    binding.recyclerRewardSystem.adapter = rewardSystemAdapter
    rewardSystemAdapter.setOnItemClickListener(
    object : RewardSystemAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RewardSystemRowModel) {
        onClickRecyclerRewardSystem(view, position, item)
      }
    }
    )
    viewModel.rewardSystemList.observe(this) {
      rewardSystemAdapter.updateData(it)
    }
    binding.rewardSystemVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUpload.setOnClickListener {
      val destIntent = RewardGrantedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtButton.setOnClickListener {
      val destIntent = AchievementsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerRewardSystem(
    view: View,
    position: Int,
    item: RewardSystemRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REWARD_SYSTEM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RewardSystemActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
