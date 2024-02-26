package com.happytails.app.modules.trackmapone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityTrackMapOneBinding
import com.happytails.app.modules.trackmapone.`data`.viewmodel.TrackMapOneVM
import kotlin.String
import kotlin.Unit

class TrackMapOneActivity :
    BaseActivity<ActivityTrackMapOneBinding>(R.layout.activity_track_map_one) {
  private val viewModel: TrackMapOneVM by viewModels<TrackMapOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trackMapOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRACK_MAP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TrackMapOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
