package com.happytails.app.modules.profilehealthcardaddinsurancestep23.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.happytails.app.databinding.BottomsheetProfileHealthCardAddInsuranceStep23Binding
import com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.model.ListbodyTwoRowModel
import com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.viewmodel.ProfileHealthCardAddInsuranceStep23VM
import com.happytails.app.modules.profilehealthcardaddinsurancestep33.ui.ProfileHealthCardAddInsuranceStep33Bottomsheet
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileHealthCardAddInsuranceStep23Bottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetProfileHealthCardAddInsuranceStep23Binding>(R.layout.bottomsheet_profile_health_card_add_insurance_step_2_3)
    {
  private val viewModel: ProfileHealthCardAddInsuranceStep23VM by
      viewModels<ProfileHealthCardAddInsuranceStep23VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbodyTwoAdapter =
    ListbodyTwoAdapter(viewModel.listbodyTwoList.value?:mutableListOf())
    binding.recyclerListbodyTwo.adapter = listbodyTwoAdapter
    listbodyTwoAdapter.setOnItemClickListener(
    object : ListbodyTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbodyTwoRowModel) {
        onClickRecyclerListbodyTwo(view, position, item)
      }
    }
    )
    viewModel.listbodyTwoList.observe(requireActivity()) {
      listbodyTwoAdapter.updateData(it)
    }
    binding.profileHealthCardAddInsuranceStep23VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destFragment = ProfileHealthCardAddInsuranceStep33Bottomsheet.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager,
          ProfileHealthCardAddInsuranceStep33Bottomsheet.TAG)
    }
  }

  fun onClickRecyclerListbodyTwo(
    view: View,
    position: Int,
    item: ListbodyTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_ADD_INSURANCE_STEP23BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): ProfileHealthCardAddInsuranceStep23Bottomsheet {
      val fragment = ProfileHealthCardAddInsuranceStep23Bottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
