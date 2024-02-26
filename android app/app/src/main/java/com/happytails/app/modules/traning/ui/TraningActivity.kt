package com.happytails.app.modules.traning.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityTraningBinding
import com.happytails.app.modules.traning.`data`.viewmodel.TraningVM
import com.happytails.app.modules.veterinarycontainer.ui.VeterinaryContainerActivity
import kotlin.String
import kotlin.Unit

class TraningActivity : BaseActivity<ActivityTraningBinding>(R.layout.activity_traning) {
  private val viewModel: TraningVM by viewModels<TraningVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.traningVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = VeterinaryContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TRANING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TraningActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
