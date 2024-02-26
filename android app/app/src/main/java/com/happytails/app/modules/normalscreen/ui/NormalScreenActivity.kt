package com.happytails.app.modules.normalscreen.ui

import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityNormalScreenBinding
import com.happytails.app.modules.normalscreen.`data`.viewmodel.NormalScreenVM
import kotlin.String
import kotlin.Unit

class NormalScreenActivity :
    BaseActivity<ActivityNormalScreenBinding>(R.layout.activity_normal_screen) {
  private val viewModel: NormalScreenVM by viewModels<NormalScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.normalScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NORMAL_SCREEN_ACTIVITY"

  }
}
