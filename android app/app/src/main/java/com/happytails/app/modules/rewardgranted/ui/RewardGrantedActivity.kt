package com.happytails.app.modules.rewardgranted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityRewardGrantedBinding
import com.happytails.app.modules.rewardgranted.`data`.viewmodel.RewardGrantedVM
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import com.happytails.app.modules.rewardverification.ui.RewardVerificationActivity
import kotlin.String
import kotlin.Unit

class RewardGrantedActivity :
    BaseActivity<ActivityRewardGrantedBinding>(R.layout.activity_reward_granted) {
  private val viewModel: RewardGrantedVM by viewModels<RewardGrantedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rewardGrantedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVerifyYourReward.setOnClickListener {
      val destIntent = RewardVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REWARD_GRANTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RewardGrantedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
