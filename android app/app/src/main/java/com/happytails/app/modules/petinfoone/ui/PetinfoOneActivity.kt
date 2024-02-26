package com.happytails.app.modules.petinfoone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityPetinfoOneBinding
import com.happytails.app.modules.petinfoone.`data`.viewmodel.PetinfoOneVM
import com.happytails.app.modules.trackmapone.ui.TrackMapOneActivity
import kotlin.String
import kotlin.Unit

class PetinfoOneActivity : BaseActivity<ActivityPetinfoOneBinding>(R.layout.activity_petinfo_one) {
  private val viewModel: PetinfoOneVM by viewModels<PetinfoOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.petinfoOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLinkedin.setOnClickListener {
      val destIntent = TrackMapOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PETINFO_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PetinfoOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
