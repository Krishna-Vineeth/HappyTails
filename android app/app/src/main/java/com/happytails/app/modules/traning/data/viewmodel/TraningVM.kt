package com.happytails.app.modules.traning.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.traning.`data`.model.TraningModel
import org.koin.core.KoinComponent

class TraningVM : ViewModel(), KoinComponent {
  val traningModel: MutableLiveData<TraningModel> = MutableLiveData(TraningModel())

  var navArguments: Bundle? = null
}
