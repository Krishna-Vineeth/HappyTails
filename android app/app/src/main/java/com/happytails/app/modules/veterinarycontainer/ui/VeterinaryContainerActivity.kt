package com.happytails.app.modules.veterinarycontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityVeterinaryContainerBinding
import com.happytails.app.extensions.loadFragment
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import com.happytails.app.modules.veterinary.ui.VeterinaryFragment
import com.happytails.app.modules.veterinarycontainer.`data`.viewmodel.VeterinaryContainerVM
import kotlin.String
import kotlin.Unit

class VeterinaryContainerActivity :
    BaseActivity<ActivityVeterinaryContainerBinding>(R.layout.activity_veterinary_container) {
  private val viewModel: VeterinaryContainerVM by viewModels<VeterinaryContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.veterinaryContainerVM = viewModel
    val destFragment = VeterinaryFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = VeterinaryFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnfiuser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumn.setOnClickListener {
      val destFragment = VeterinaryFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = VeterinaryFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnhome.setOnClickListener {
      val destIntent = MainMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VETERINARY_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VeterinaryContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
