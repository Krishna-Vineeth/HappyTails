package com.happytails.app.modules.petinfoone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.petinfoone.`data`.model.PetinfoOneModel
import org.koin.core.KoinComponent

class PetinfoOneVM : ViewModel(), KoinComponent {
  val petinfoOneModel: MutableLiveData<PetinfoOneModel> = MutableLiveData(PetinfoOneModel())

  var navArguments: Bundle? = null
}
