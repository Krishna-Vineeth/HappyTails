package com.happytails.app.modules.profilehealthcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityProfileHealthCardBinding
import com.happytails.app.modules.insurance.ui.InsuranceActivity
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.petinfoone.ui.PetinfoOneActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.profilehealthcard.`data`.viewmodel.ProfileHealthCardVM
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import kotlin.String
import kotlin.Unit

class ProfileHealthCardActivity :
    BaseActivity<ActivityProfileHealthCardBinding>(R.layout.activity_profile_health_card) {
  private val viewModel: ProfileHealthCardVM by viewModels<ProfileHealthCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileHealthCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumncamera.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnhome.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTab.setOnClickListener {
      val destIntent = PetinfoOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTabTwo.setOnClickListener {
      val destIntent = InsuranceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_HEALTH_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileHealthCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
