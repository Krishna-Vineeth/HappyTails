package com.happytails.app.modules.community.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.community.`data`.model.CommunityModel
import com.happytails.app.modules.community.`data`.model.Listrectangle1imRowModel
import com.happytails.app.modules.community.`data`.model.Listrectangle1imThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CommunityVM : ViewModel(), KoinComponent {
  val communityModel: MutableLiveData<CommunityModel> = MutableLiveData(CommunityModel())

  var navArguments: Bundle? = null

  val listrectangle1imList: MutableLiveData<MutableList<Listrectangle1imRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle1imThreeList: MutableLiveData<MutableList<Listrectangle1imThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
