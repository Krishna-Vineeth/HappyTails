package com.happytails.app.modules.rewardverification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.rewardverification.`data`.model.ListlightbodyRowModel
import com.happytails.app.modules.rewardverification.`data`.model.ListtitleTwo1RowModel
import com.happytails.app.modules.rewardverification.`data`.model.RewardVerificationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RewardVerificationVM : ViewModel(), KoinComponent {
  val rewardVerificationModel: MutableLiveData<RewardVerificationModel> =
      MutableLiveData(RewardVerificationModel())

  var navArguments: Bundle? = null

  val listlightbodyList: MutableLiveData<MutableList<ListlightbodyRowModel>> =
      MutableLiveData(mutableListOf())

  val listtitleTwoList: MutableLiveData<MutableList<ListtitleTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}
