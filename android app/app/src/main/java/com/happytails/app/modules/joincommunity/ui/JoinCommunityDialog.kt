package com.happytails.app.modules.joincommunity.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseDialogFragment
import com.happytails.app.databinding.DialogJoinCommunityBinding
import com.happytails.app.modules.community.ui.CommunityActivity
import com.happytails.app.modules.joincommunity.`data`.viewmodel.JoinCommunityVM
import kotlin.String
import kotlin.Unit

class JoinCommunityDialog :
    BaseDialogFragment<DialogJoinCommunityBinding>(R.layout.dialog_join_community) {
  private val viewModel: JoinCommunityVM by viewModels<JoinCommunityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.joinCommunityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      val destIntent = CommunityActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.imageClose.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "JOIN_COMMUNITY_DIALOG"


    fun getInstance(bundle: Bundle?): JoinCommunityDialog {
      val fragment = JoinCommunityDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
