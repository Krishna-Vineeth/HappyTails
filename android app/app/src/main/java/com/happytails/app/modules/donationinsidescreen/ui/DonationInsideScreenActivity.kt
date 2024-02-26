package com.happytails.app.modules.donationinsidescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityDonationInsideScreenBinding
import com.happytails.app.modules.donationinsidescreen.`data`.model.ListrectangleseventyRowModel
import com.happytails.app.modules.donationinsidescreen.`data`.viewmodel.DonationInsideScreenVM
import com.happytails.app.modules.donationscreen.ui.DonationScreenActivity
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DonationInsideScreenActivity :
    BaseActivity<ActivityDonationInsideScreenBinding>(R.layout.activity_donation_inside_screen) {
  private val viewModel: DonationInsideScreenVM by viewModels<DonationInsideScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangleseventyAdapter =
    ListrectangleseventyAdapter(viewModel.listrectangleseventyList.value?:mutableListOf())
    binding.recyclerListrectangleseventy.adapter = listrectangleseventyAdapter
    listrectangleseventyAdapter.setOnItemClickListener(
    object : ListrectangleseventyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectangleseventyRowModel) {
        onClickRecyclerListrectangleseventy(view, position, item)
      }
    }
    )
    viewModel.listrectangleseventyList.observe(this) {
      listrectangleseventyAdapter.updateData(it)
    }
    binding.donationInsideScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButtons.setOnClickListener {
      val destIntent = DonationScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewCreatefromfra.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackcamera.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnhome.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectangleseventy(
    view: View,
    position: Int,
    item: ListrectangleseventyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DONATION_INSIDE_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DonationInsideScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
