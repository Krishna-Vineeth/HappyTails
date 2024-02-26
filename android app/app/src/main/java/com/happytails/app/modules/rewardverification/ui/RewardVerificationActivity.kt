package com.happytails.app.modules.rewardverification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityRewardVerificationBinding
import com.happytails.app.modules.rewardgranted.ui.RewardGrantedActivity
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import com.happytails.app.modules.rewardverification.`data`.model.ListlightbodyRowModel
import com.happytails.app.modules.rewardverification.`data`.model.ListtitleTwo1RowModel
import com.happytails.app.modules.rewardverification.`data`.viewmodel.RewardVerificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RewardVerificationActivity :
    BaseActivity<ActivityRewardVerificationBinding>(R.layout.activity_reward_verification) {
  private val viewModel: RewardVerificationVM by viewModels<RewardVerificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlightbodyAdapter =
    ListlightbodyAdapter(viewModel.listlightbodyList.value?:mutableListOf())
    binding.recyclerListlightbody.adapter = listlightbodyAdapter
    listlightbodyAdapter.setOnItemClickListener(
    object : ListlightbodyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlightbodyRowModel) {
        onClickRecyclerListlightbody(view, position, item)
      }
    }
    )
    viewModel.listlightbodyList.observe(this) {
      listlightbodyAdapter.updateData(it)
    }
    val listtitleTwoAdapter =
    ListtitleTwoAdapter(viewModel.listtitleTwoList.value?:mutableListOf())
    binding.recyclerListtitleTwo.adapter = listtitleTwoAdapter
    listtitleTwoAdapter.setOnItemClickListener(
    object : ListtitleTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtitleTwo1RowModel) {
        onClickRecyclerListtitleTwo(view, position, item)
      }
    }
    )
    viewModel.listtitleTwoList.observe(this) {
      listtitleTwoAdapter.updateData(it)
    }
    binding.rewardVerificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUploadMore.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = RewardGrantedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListlightbody(
    view: View,
    position: Int,
    item: ListlightbodyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtitleTwo(
    view: View,
    position: Int,
    item: ListtitleTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REWARD_VERIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RewardVerificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
