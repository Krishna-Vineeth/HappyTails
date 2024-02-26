package com.happytails.app.modules.rewardgranted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.rewardgranted.`data`.model.RewardGrantedModel
import org.koin.core.KoinComponent

class RewardGrantedVM : ViewModel(), KoinComponent {
  val rewardGrantedModel: MutableLiveData<RewardGrantedModel> =
      MutableLiveData(RewardGrantedModel())

  var navArguments: Bundle? = null
}
