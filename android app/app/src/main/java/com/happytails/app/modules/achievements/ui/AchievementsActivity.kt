package com.happytails.app.modules.achievements.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityAchievementsBinding
import com.happytails.app.modules.achievements.`data`.model.AchievementsRowModel
import com.happytails.app.modules.achievements.`data`.viewmodel.AchievementsVM
import com.happytails.app.modules.profilehealthcardinsuranceemptyone.ui.ProfileHealthCardInsuranceEmptyOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AchievementsActivity :
    BaseActivity<ActivityAchievementsBinding>(R.layout.activity_achievements) {
  private val viewModel: AchievementsVM by viewModels<AchievementsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val achievementsAdapter =
    AchievementsAdapter(viewModel.achievementsList.value?:mutableListOf())
    binding.recyclerAchievements.adapter = achievementsAdapter
    achievementsAdapter.setOnItemClickListener(
    object : AchievementsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AchievementsRowModel) {
        onClickRecyclerAchievements(view, position, item)
      }
    }
    )
    viewModel.achievementsList.observe(this) {
      achievementsAdapter.updateData(it)
    }
    binding.achievementsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnMore.setOnClickListener {
      val destIntent = ProfileHealthCardInsuranceEmptyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerAchievements(
    view: View,
    position: Int,
    item: AchievementsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACHIEVEMENTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AchievementsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
