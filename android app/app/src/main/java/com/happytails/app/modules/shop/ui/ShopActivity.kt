package com.happytails.app.modules.shop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityShopBinding
import com.happytails.app.modules.shop.`data`.model.ShopRowModel
import com.happytails.app.modules.shop.`data`.viewmodel.ShopVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShopActivity : BaseActivity<ActivityShopBinding>(R.layout.activity_shop) {
  private val viewModel: ShopVM by viewModels<ShopVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val shopAdapter = ShopAdapter(viewModel.shopList.value?:mutableListOf())
    binding.recyclerShop.adapter = shopAdapter
    shopAdapter.setOnItemClickListener(
    object : ShopAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ShopRowModel) {
        onClickRecyclerShop(view, position, item)
      }
    }
    )
    viewModel.shopList.observe(this) {
      shopAdapter.updateData(it)
    }
    binding.shopVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerShop(
    view: View,
    position: Int,
    item: ShopRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHOP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShopActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
