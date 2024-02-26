package com.happytails.app.modules.community.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityCommunityBinding
import com.happytails.app.modules.community.`data`.model.Listrectangle1imRowModel
import com.happytails.app.modules.community.`data`.model.Listrectangle1imThreeRowModel
import com.happytails.app.modules.community.`data`.viewmodel.CommunityVM
import com.happytails.app.modules.joincommunity.ui.JoinCommunityDialog
import com.happytails.app.modules.mainmenu.ui.MainMenuActivity
import com.happytails.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CommunityActivity : BaseActivity<ActivityCommunityBinding>(R.layout.activity_community) {
  private val viewModel: CommunityVM by viewModels<CommunityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle1imAdapter =
    Listrectangle1imAdapter(viewModel.listrectangle1imList.value?:mutableListOf())
    binding.recyclerListrectangle1im.adapter = listrectangle1imAdapter
    listrectangle1imAdapter.setOnItemClickListener(
    object : Listrectangle1imAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle1imRowModel) {
        onClickRecyclerListrectangle1im(view, position, item)
      }
    }
    )
    viewModel.listrectangle1imList.observe(this) {
      listrectangle1imAdapter.updateData(it)
    }
    val listrectangle1imThreeAdapter =
    Listrectangle1imThreeAdapter(viewModel.listrectangle1imThreeList.value?:mutableListOf())
    binding.recyclerListrectangle1imThree.adapter = listrectangle1imThreeAdapter
    listrectangle1imThreeAdapter.setOnItemClickListener(
    object : Listrectangle1imThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectangle1imThreeRowModel) {
        onClickRecyclerListrectangle1imThree(view, position, item)
      }
    }
    )
    viewModel.listrectangle1imThreeList.observe(this) {
      listrectangle1imThreeAdapter.updateData(it)
    }
    binding.communityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
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

  fun onClickRecyclerListrectangle1im(
    view: View,
    position: Int,
    item: Listrectangle1imRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangle1im -> {
        onClickRecyclerListrectangle1imLinearRowrectangle1im(view, position, item)
      }
    }
  }

  fun onClickRecyclerListrectangle1imThree(
    view: View,
    position: Int,
    item: Listrectangle1imThreeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangle1imThree -> {
        val destFragment = JoinCommunityDialog.getInstance(null)
        destFragment.show(this.supportFragmentManager, JoinCommunityDialog.TAG)
      }
    }
  }

  fun onClickRecyclerListrectangle1imLinearRowrectangle1im(
    view: View,
    position: Int,
    item: Listrectangle1imRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destFragment = JoinCommunityDialog.getInstance(null)
        destFragment.show(this.supportFragmentManager, JoinCommunityDialog.TAG)
      }
      1 -> {
        val destFragment = JoinCommunityDialog.getInstance(null)
        destFragment.show(this.supportFragmentManager, JoinCommunityDialog.TAG)
      }
    }
  }

  companion object {
    const val TAG: String = "COMMUNITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CommunityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
