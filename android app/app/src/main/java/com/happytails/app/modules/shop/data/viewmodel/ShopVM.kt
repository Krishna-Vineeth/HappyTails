package com.happytails.app.modules.shop.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.shop.`data`.model.ShopModel
import com.happytails.app.modules.shop.`data`.model.ShopRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShopVM : ViewModel(), KoinComponent {
  val shopModel: MutableLiveData<ShopModel> = MutableLiveData(ShopModel())

  var navArguments: Bundle? = null

  val shopList: MutableLiveData<MutableList<ShopRowModel>> = MutableLiveData(mutableListOf())
}
