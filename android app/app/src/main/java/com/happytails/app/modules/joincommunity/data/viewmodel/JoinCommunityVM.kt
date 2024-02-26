package com.happytails.app.modules.joincommunity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.joincommunity.`data`.model.JoinCommunityModel
import org.koin.core.KoinComponent

class JoinCommunityVM : ViewModel(), KoinComponent {
  val joinCommunityModel: MutableLiveData<JoinCommunityModel> =
      MutableLiveData(JoinCommunityModel())

  var navArguments: Bundle? = null
}
