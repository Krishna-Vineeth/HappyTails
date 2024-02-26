package com.happytails.app.modules.adoptpet.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityAdoptPetBinding
import com.happytails.app.modules.adoptpet.`data`.model.AdoptPetRowModel
import com.happytails.app.modules.adoptpet.`data`.viewmodel.AdoptPetVM
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.petinfo.ui.PetinfoActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.profilehealthcard.ui.ProfileHealthCardActivity
import com.happytails.app.modules.rewardsystem.ui.RewardSystemActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AdoptPetActivity : BaseActivity<ActivityAdoptPetBinding>(R.layout.activity_adopt_pet) {
  private val viewModel: AdoptPetVM by viewModels<AdoptPetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val adoptPetAdapter = AdoptPetAdapter(viewModel.adoptPetList.value?:mutableListOf())
    binding.recyclerAdoptPet.adapter = adoptPetAdapter
    adoptPetAdapter.setOnItemClickListener(
    object : AdoptPetAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AdoptPetRowModel) {
        onClickRecyclerAdoptPet(view, position, item)
      }
    }
    )
    viewModel.adoptPetList.observe(this) {
      adoptPetAdapter.updateData(it)
    }
    binding.adoptPetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnhome.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumncamera.setOnClickListener {
      val destIntent = RewardSystemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerAdoptPet(
    view: View,
    position: Int,
    item: AdoptPetRowModel
  ): Unit {
    when(view.id) {
      R.id.txtGroupSevenOne ->  {
        val destIntent = PetinfoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.txtGroupSeven ->  {
        val destIntent = ProfileHealthCardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "ADOPT_PET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdoptPetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
