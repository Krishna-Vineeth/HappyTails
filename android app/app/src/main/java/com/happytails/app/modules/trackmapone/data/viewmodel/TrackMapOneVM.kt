package com.happytails.app.modules.trackmapone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.trackmapone.`data`.model.TrackMapOneModel
import org.koin.core.KoinComponent

class TrackMapOneVM : ViewModel(), KoinComponent {
  val trackMapOneModel: MutableLiveData<TrackMapOneModel> = MutableLiveData(TrackMapOneModel())

  var navArguments: Bundle? = null
}
