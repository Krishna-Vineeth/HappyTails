package com.happytails.app.modules.trackmap.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityTrackMapBinding
import com.happytails.app.modules.trackmap.`data`.viewmodel.TrackMapVM
import kotlin.String
import kotlin.Unit

class TrackMapActivity : BaseActivity<ActivityTrackMapBinding>(R.layout.activity_track_map) {
  private val viewModel: TrackMapVM by viewModels<TrackMapVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trackMapVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRACK_MAP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TrackMapActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
