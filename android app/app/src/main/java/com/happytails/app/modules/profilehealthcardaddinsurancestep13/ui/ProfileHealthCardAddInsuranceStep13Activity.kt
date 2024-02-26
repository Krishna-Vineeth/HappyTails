package com.happytails.app.modules.profilehealthcardaddinsurancestep13.ui

import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityProfileHealthCardAddInsuranceStep13Binding
import com.happytails.app.modules.profilehealthcardaddinsurancestep13.`data`.viewmodel.ProfileHealthCardAddInsuranceStep13VM
import com.happytails.app.modules.profilehealthcardaddinsurancestep23.ui.ProfileHealthCardAddInsuranceStep23Bottomsheet
import kotlin.String
import kotlin.Unit

class ProfileHealthCardAddInsuranceStep13Activity :
    BaseActivity<ActivityProfileHealthCardAddInsuranceStep13Binding>(R.layout.activity_profile_health_card_add_insurance_step_1_3)
    {
  private val viewModel: ProfileHealthCardAddInsuranceStep13VM by
      viewModels<ProfileHealthCardAddInsuranceStep13VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileHealthCardAddInsuranceStep13VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnNext.setOnClickListener {
      val destFragment = ProfileHealthCardAddInsuranceStep23Bottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager,
          ProfileHealthCardAddInsuranceStep23Bottomsheet.TAG)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_ADD_INSURANCE_STEP13ACTIVITY"

  }
}
