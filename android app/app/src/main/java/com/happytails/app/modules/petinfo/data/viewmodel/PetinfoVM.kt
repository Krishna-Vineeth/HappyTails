package com.happytails.app.modules.petinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.petinfo.`data`.model.PetinfoModel
import org.koin.core.KoinComponent

class PetinfoVM : ViewModel(), KoinComponent {
  val petinfoModel: MutableLiveData<PetinfoModel> = MutableLiveData(PetinfoModel())

  var navArguments: Bundle? = null
}
