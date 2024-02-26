package com.happytails.app.modules.donationscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityDonationScreenBinding
import com.happytails.app.modules.donationscreen.`data`.viewmodel.DonationScreenVM
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.profilehealthcardinsuranceemptytwo.ui.ProfileHealthCardInsuranceEmptyTwoActivity
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import kotlin.String
import kotlin.Unit

class DonationScreenActivity :
    BaseActivity<ActivityDonationScreenBinding>(R.layout.activity_donation_screen) {
  private val viewModel: DonationScreenVM by viewModels<DonationScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.donationScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackcamera.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewCreatefromfra.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnhome.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnDonateRs50Zero.setOnClickListener {
      val destIntent = ProfileHealthCardInsuranceEmptyTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DONATION_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DonationScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
