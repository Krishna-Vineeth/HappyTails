package com.happytails.app.modules.profilehealthcardinsuranceemptyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityProfileHealthCardInsuranceEmptyOneBinding
import com.happytails.app.modules.profilehealthcard.ui.ProfileHealthCardActivity
import com.happytails.app.modules.profilehealthcardinsuranceemptyone.`data`.viewmodel.ProfileHealthCardInsuranceEmptyOneVM
import kotlin.String
import kotlin.Unit

class ProfileHealthCardInsuranceEmptyOneActivity :
    BaseActivity<ActivityProfileHealthCardInsuranceEmptyOneBinding>(R.layout.activity_profile_health_card_insurance_empty_one)
    {
  private val viewModel: ProfileHealthCardInsuranceEmptyOneVM by
      viewModels<ProfileHealthCardInsuranceEmptyOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileHealthCardInsuranceEmptyOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = ProfileHealthCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_INSURANCE_EMPTY_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileHealthCardInsuranceEmptyOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
