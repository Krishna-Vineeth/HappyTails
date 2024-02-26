package com.happytails.app.modules.petinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityPetinfoBinding
import com.happytails.app.modules.petinfo.`data`.viewmodel.PetinfoVM
import com.happytails.app.modules.trackmapone.ui.TrackMapOneActivity
import kotlin.String
import kotlin.Unit

class PetinfoActivity : BaseActivity<ActivityPetinfoBinding>(R.layout.activity_petinfo) {
  private val viewModel: PetinfoVM by viewModels<PetinfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.petinfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLinkedin.setOnClickListener {
      val destIntent = TrackMapOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PETINFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PetinfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
