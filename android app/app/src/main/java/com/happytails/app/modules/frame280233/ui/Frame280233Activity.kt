package com.happytails.app.modules.frame280233.ui

import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityFrame280233Binding
import com.happytails.app.modules.frame280233.`data`.viewmodel.Frame280233VM
import kotlin.String
import kotlin.Unit

class Frame280233Activity : BaseActivity<ActivityFrame280233Binding>(R.layout.activity_frame_280233)
    {
  private val viewModel: Frame280233VM by viewModels<Frame280233VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frame280233VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME280233ACTIVITY"

  }
}
