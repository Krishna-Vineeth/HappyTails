package com.happytails.app.modules.frame280233.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.frame280233.`data`.model.Frame280233Model
import org.koin.core.KoinComponent

class Frame280233VM : ViewModel(), KoinComponent {
  val frame280233Model: MutableLiveData<Frame280233Model> = MutableLiveData(Frame280233Model())

  var navArguments: Bundle? = null
}
