package com.happytails.app.modules.adoptpet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.adoptpet.`data`.model.AdoptPetModel
import com.happytails.app.modules.adoptpet.`data`.model.AdoptPetRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AdoptPetVM : ViewModel(), KoinComponent {
  val adoptPetModel: MutableLiveData<AdoptPetModel> = MutableLiveData(AdoptPetModel())

  var navArguments: Bundle? = null

  val adoptPetList: MutableLiveData<MutableList<AdoptPetRowModel>> =
      MutableLiveData(mutableListOf())
}
