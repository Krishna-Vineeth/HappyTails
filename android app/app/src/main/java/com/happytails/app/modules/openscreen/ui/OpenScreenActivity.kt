package com.happytails.app.modules.openscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityOpenScreenBinding
import com.happytails.app.modules.createaccount.ui.CreateAccountActivity
import com.happytails.app.modules.openscreen.`data`.viewmodel.OpenScreenVM
import kotlin.String
import kotlin.Unit

class OpenScreenActivity : BaseActivity<ActivityOpenScreenBinding>(R.layout.activity_open_screen) {
  private val viewModel: OpenScreenVM by viewModels<OpenScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.openScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = CreateAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OPEN_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OpenScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
