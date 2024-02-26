package com.happytails.app.modules.launchscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityLaunchScreenBinding
import com.happytails.app.modules.donateone.ui.DonateOneActivity
import com.happytails.app.modules.launchscreen.`data`.viewmodel.LaunchScreenVM
import kotlin.String
import kotlin.Unit

class LaunchScreenActivity :
    BaseActivity<ActivityLaunchScreenBinding>(R.layout.activity_launch_screen) {
  private val viewModel: LaunchScreenVM by viewModels<LaunchScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.launchScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = DonateOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LAUNCH_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LaunchScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
