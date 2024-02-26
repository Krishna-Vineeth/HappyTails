package com.happytails.app.modules.petcare.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityPetCareBinding
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.petcare.`data`.model.PetCareRowModel
import com.happytails.app.modules.petcare.`data`.viewmodel.PetCareVM
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.shop.ui.ShopActivity
import com.happytails.app.modules.traning.ui.TraningActivity
import com.happytails.app.modules.veterinarycontainer.ui.VeterinaryContainerActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PetCareActivity : BaseActivity<ActivityPetCareBinding>(R.layout.activity_pet_care) {
  private val viewModel: PetCareVM by viewModels<PetCareVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val petCareAdapter = PetCareAdapter(viewModel.petCareList.value?:mutableListOf())
    binding.recyclerPetCare.adapter = petCareAdapter
    petCareAdapter.setOnItemClickListener(
    object : PetCareAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PetCareRowModel) {
        onClickRecyclerPetCare(view, position, item)
      }
    }
    )
    viewModel.petCareList.observe(this) {
      petCareAdapter.updateData(it)
    }
    binding.petCareVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUnsplashgKXKBY.setOnClickListener {
      val destIntent = ShopActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePetprofilepicFour.setOnClickListener {
      val destIntent = TraningActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePetprofilepicThree.setOnClickListener {
      val destIntent = VeterinaryContainerActivity.getIntent(this, null)
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
  }

  fun onClickRecyclerPetCare(
    view: View,
    position: Int,
    item: PetCareRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PET_CARE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PetCareActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
