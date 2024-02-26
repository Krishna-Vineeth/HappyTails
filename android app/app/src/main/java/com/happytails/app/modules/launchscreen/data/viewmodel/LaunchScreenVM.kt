package com.happytails.app.modules.launchscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.launchscreen.`data`.model.LaunchScreenModel
import org.koin.core.KoinComponent

class LaunchScreenVM : ViewModel(), KoinComponent {
  val launchScreenModel: MutableLiveData<LaunchScreenModel> = MutableLiveData(LaunchScreenModel())

  var navArguments: Bundle? = null
}
