package com.happytails.app.modules.petcare.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.petcare.`data`.model.PetCareModel
import com.happytails.app.modules.petcare.`data`.model.PetCareRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PetCareVM : ViewModel(), KoinComponent {
  val petCareModel: MutableLiveData<PetCareModel> = MutableLiveData(PetCareModel())

  var navArguments: Bundle? = null

  val petCareList: MutableLiveData<MutableList<PetCareRowModel>> = MutableLiveData(mutableListOf())
}
