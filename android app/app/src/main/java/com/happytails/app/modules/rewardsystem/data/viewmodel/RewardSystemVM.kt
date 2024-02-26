package com.happytails.app.modules.rewardsystem.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.rewardsystem.`data`.model.RewardSystemModel
import com.happytails.app.modules.rewardsystem.`data`.model.RewardSystemRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RewardSystemVM : ViewModel(), KoinComponent {
  val rewardSystemModel: MutableLiveData<RewardSystemModel> = MutableLiveData(RewardSystemModel())

  var navArguments: Bundle? = null

  val rewardSystemList: MutableLiveData<MutableList<RewardSystemRowModel>> =
      MutableLiveData(mutableListOf())
}
