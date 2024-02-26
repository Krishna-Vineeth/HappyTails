package com.happytails.app.modules.normalscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.normalscreen.`data`.model.NormalScreenModel
import org.koin.core.KoinComponent

class NormalScreenVM : ViewModel(), KoinComponent {
  val normalScreenModel: MutableLiveData<NormalScreenModel> = MutableLiveData(NormalScreenModel())

  var navArguments: Bundle? = null
}
