package com.happytails.app.modules.profilehealthcardaddinsurancestep33.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.happytails.app.databinding.BottomsheetProfileHealthCardAddInsuranceStep33Binding
import com.happytails.app.modules.profilehealthcardaddinsurancestep33.`data`.viewmodel.ProfileHealthCardAddInsuranceStep33VM
import com.happytails.app.modules.profilehealthcardinsuranceempty.ui.ProfileHealthCardInsuranceEmptyActivity
import kotlin.String
import kotlin.Unit

class ProfileHealthCardAddInsuranceStep33Bottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetProfileHealthCardAddInsuranceStep33Binding>(R.layout.bottomsheet_profile_health_card_add_insurance_step_3_3)
    {
  private val viewModel: ProfileHealthCardAddInsuranceStep33VM by
      viewModels<ProfileHealthCardAddInsuranceStep33VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileHealthCardAddInsuranceStep33VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destIntent = ProfileHealthCardInsuranceEmptyActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_ADD_INSURANCE_STEP33BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): ProfileHealthCardAddInsuranceStep33Bottomsheet {
      val fragment = ProfileHealthCardAddInsuranceStep33Bottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
