package com.happytails.app.modules.profilehealthcardinsuranceemptytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityProfileHealthCardInsuranceEmptyTwoBinding
import com.happytails.app.modules.donateone.ui.DonateOneActivity
import com.happytails.app.modules.profilehealthcard.ui.ProfileHealthCardActivity
import com.happytails.app.modules.profilehealthcardinsuranceemptytwo.`data`.viewmodel.ProfileHealthCardInsuranceEmptyTwoVM
import kotlin.String
import kotlin.Unit

class ProfileHealthCardInsuranceEmptyTwoActivity :
    BaseActivity<ActivityProfileHealthCardInsuranceEmptyTwoBinding>(R.layout.activity_profile_health_card_insurance_empty_two)
    {
  private val viewModel: ProfileHealthCardInsuranceEmptyTwoVM by
      viewModels<ProfileHealthCardInsuranceEmptyTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileHealthCardInsuranceEmptyTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButtonMobile.setOnClickListener {
      val destIntent = DonateOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = ProfileHealthCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_INSURANCE_EMPTY_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileHealthCardInsuranceEmptyTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
