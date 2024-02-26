package com.happytails.app.modules.insurance.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityInsuranceBinding
import com.happytails.app.modules.insurance.`data`.viewmodel.InsuranceVM
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.petinfoone.ui.PetinfoOneActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.profilehealthcard.ui.ProfileHealthCardActivity
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import kotlin.String
import kotlin.Unit

class InsuranceActivity : BaseActivity<ActivityInsuranceBinding>(R.layout.activity_insurance) {
  private val viewModel: InsuranceVM by viewModels<InsuranceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.insuranceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumncamera.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnhome.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTabOne.setOnClickListener {
      val destIntent = ProfileHealthCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTab.setOnClickListener {
      val destIntent = PetinfoOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INSURANCE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InsuranceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
