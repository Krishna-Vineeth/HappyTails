package com.happytails.app.modules.veterinary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.veterinary.`data`.model.VeterinaryModel
import com.happytails.app.modules.veterinary.`data`.model.VeterinaryRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VeterinaryVM : ViewModel(), KoinComponent {
  val veterinaryModel: MutableLiveData<VeterinaryModel> = MutableLiveData(VeterinaryModel())

  var navArguments: Bundle? = null

  val veterinaryList: MutableLiveData<MutableList<VeterinaryRowModel>> =
      MutableLiveData(mutableListOf())
}
