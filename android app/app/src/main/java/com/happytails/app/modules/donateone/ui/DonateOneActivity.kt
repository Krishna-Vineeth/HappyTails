package com.happytails.app.modules.donateone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityDonateOneBinding
import com.happytails.app.modules.donateone.`data`.model.DonateOneRowModel
import com.happytails.app.modules.donateone.`data`.viewmodel.DonateOneVM
import com.happytails.app.modules.donationinsidescreen.ui.DonationInsideScreenActivity
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DonateOneActivity : BaseActivity<ActivityDonateOneBinding>(R.layout.activity_donate_one) {
  private val viewModel: DonateOneVM by viewModels<DonateOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val donateOneAdapter = DonateOneAdapter(viewModel.donateOneList.value?:mutableListOf())
    binding.recyclerDonateOne.adapter = donateOneAdapter
    donateOneAdapter.setOnItemClickListener(
    object : DonateOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DonateOneRowModel) {
        onClickRecyclerDonateOne(view, position, item)
      }
    }
    )
    viewModel.donateOneList.observe(this) {
      donateOneAdapter.updateData(it)
    }
    binding.donateOneVM = viewModel
    setUpSearchViewBarsSearchBListener()
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
  }

  fun onClickRecyclerDonateOne(
    view: View,
    position: Int,
    item: DonateOneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangleseventy -> {
        val destIntent = DonationInsideScreenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  private fun setUpSearchViewBarsSearchBListener(): Unit {
    binding.searchViewBarsSearchB.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "DONATE_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, DonateOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
