package com.happytails.app.modules.veterinarycontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.veterinarycontainer.`data`.model.VeterinaryContainerModel
import org.koin.core.KoinComponent

class VeterinaryContainerVM : ViewModel(), KoinComponent {
  val veterinaryContainerModel: MutableLiveData<VeterinaryContainerModel> =
      MutableLiveData(VeterinaryContainerModel())

  var navArguments: Bundle? = null
}
