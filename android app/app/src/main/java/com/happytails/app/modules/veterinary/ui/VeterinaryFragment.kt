package com.happytails.app.modules.veterinary.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseFragment
import com.happytails.app.databinding.FragmentVeterinaryBinding
import com.happytails.app.modules.veterinary.`data`.model.VeterinaryRowModel
import com.happytails.app.modules.veterinary.`data`.viewmodel.VeterinaryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VeterinaryFragment : BaseFragment<FragmentVeterinaryBinding>(R.layout.fragment_veterinary) {
  private val viewModel: VeterinaryVM by viewModels<VeterinaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val veterinaryAdapter = VeterinaryAdapter(viewModel.veterinaryList.value?:mutableListOf())
    binding.recyclerVeterinary.adapter = veterinaryAdapter
    veterinaryAdapter.setOnItemClickListener(
    object : VeterinaryAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : VeterinaryRowModel) {
        onClickRecyclerVeterinary(view, position, item)
      }
    }
    )
    viewModel.veterinaryList.observe(requireActivity()) {
      veterinaryAdapter.updateData(it)
    }
    binding.veterinaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerVeterinary(
    view: View,
    position: Int,
    item: VeterinaryRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VETERINARY_FRAGMENT"


    fun getInstance(bundle: Bundle?): VeterinaryFragment {
      val fragment = VeterinaryFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
