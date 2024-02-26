package com.happytails.app.modules.profilehealthcardvaccinesdetails.ui

import androidx.fragment.app.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.happytails.app.databinding.BottomsheetProfileHealthCardVaccinesDetailsBinding
import com.happytails.app.modules.profilehealthcardvaccinesdetails.`data`.viewmodel.ProfileHealthCardVaccinesDetailsVM
import kotlin.String
import kotlin.Unit

class ProfileHealthCardVaccinesDetailsBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetProfileHealthCardVaccinesDetailsBinding>(R.layout.bottomsheet_profile_health_card_vaccines_details)
    {
  private val viewModel: ProfileHealthCardVaccinesDetailsVM by
      viewModels<ProfileHealthCardVaccinesDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileHealthCardVaccinesDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_VACCINES_DETAILS_BOTTOMSHEET"

  }
}
