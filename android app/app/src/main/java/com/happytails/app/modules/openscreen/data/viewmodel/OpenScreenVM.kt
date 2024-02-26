package com.happytails.app.modules.openscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.openscreen.`data`.model.OpenScreenModel
import org.koin.core.KoinComponent

class OpenScreenVM : ViewModel(), KoinComponent {
  val openScreenModel: MutableLiveData<OpenScreenModel> = MutableLiveData(OpenScreenModel())

  var navArguments: Bundle? = null
}
