package com.happytails.app.modules.mainmenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityMainMenuBinding
import com.happytails.app.modules.adoptpet.ui.AdoptPetActivity
import com.happytails.app.modules.launchscreen.ui.LaunchScreenActivity
import com.happytails.app.modules.mainmenu.`data`.viewmodel.MainMenuVM
import com.happytails.app.modules.petcare.ui.PetCareActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import kotlin.String
import kotlin.Unit

class MainMenuActivity : BaseActivity<ActivityMainMenuBinding>(R.layout.activity_main_menu) {
  private val viewModel: MainMenuVM by viewModels<MainMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageFour.setOnClickListener {
      val destIntent = PetCareActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumndonate.setOnClickListener {
      val destIntent = LaunchScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageTwo.setOnClickListener {
      val destIntent = AdoptPetActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumncamera.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSeeMoreOne.setOnClickListener {
      val destIntent = LaunchScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImage.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSeeMore.setOnClickListener {
      val destIntent = AdoptPetActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBanner.setOnClickListener {
      val destIntent = PetCareActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MAIN_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
