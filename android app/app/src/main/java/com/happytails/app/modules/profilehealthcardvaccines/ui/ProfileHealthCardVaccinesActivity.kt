package com.happytails.app.modules.profilehealthcardvaccines.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityProfileHealthCardVaccinesBinding
import com.happytails.app.modules.profilehealthcard.ui.ProfileHealthCardActivity
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ListtitleFiveRowModel
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ListtitleTwoRowModel
import com.happytails.app.modules.profilehealthcardvaccines.`data`.viewmodel.ProfileHealthCardVaccinesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileHealthCardVaccinesActivity :
    BaseActivity<ActivityProfileHealthCardVaccinesBinding>(R.layout.activity_profile_health_card_vaccines)
    {
  private val viewModel: ProfileHealthCardVaccinesVM by viewModels<ProfileHealthCardVaccinesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtitleTwoAdapter =
    ListtitleTwoAdapter(viewModel.listtitleTwoList.value?:mutableListOf())
    binding.recyclerListtitleTwo.adapter = listtitleTwoAdapter
    listtitleTwoAdapter.setOnItemClickListener(
    object : ListtitleTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtitleTwoRowModel) {
        onClickRecyclerListtitleTwo(view, position, item)
      }
    }
    )
    viewModel.listtitleTwoList.observe(this) {
      listtitleTwoAdapter.updateData(it)
    }
    val listtitleFiveAdapter =
    ListtitleFiveAdapter(viewModel.listtitleFiveList.value?:mutableListOf())
    binding.recyclerListtitleFive.adapter = listtitleFiveAdapter
    listtitleFiveAdapter.setOnItemClickListener(
    object : ListtitleFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtitleFiveRowModel) {
        onClickRecyclerListtitleFive(view, position, item)
      }
    }
    )
    viewModel.listtitleFiveList.observe(this) {
      listtitleFiveAdapter.updateData(it)
    }
    binding.profileHealthCardVaccinesVM = viewModel
    setUpSearchViewInputContentListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = ProfileHealthCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListtitleTwo(
    view: View,
    position: Int,
    item: ListtitleTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtitleFive(
    view: View,
    position: Int,
    item: ListtitleFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewInputContentListener(): Unit {
    binding.searchViewInputContent.setOnQueryTextListener(object :
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
      const val TAG: String = "PROFILE_HEALTH_CARD_VACCINES_ACTIVITY"

    }
  }
