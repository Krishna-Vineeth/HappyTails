package com.happytails.app.modules.trackmap.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.trackmap.`data`.model.TrackMapModel
import org.koin.core.KoinComponent

class TrackMapVM : ViewModel(), KoinComponent {
  val trackMapModel: MutableLiveData<TrackMapModel> = MutableLiveData(TrackMapModel())

  var navArguments: Bundle? = null
}
