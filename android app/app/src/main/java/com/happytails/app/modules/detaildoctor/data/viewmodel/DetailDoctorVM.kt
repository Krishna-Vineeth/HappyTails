package com.happytails.app.modules.detaildoctor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.detaildoctor.`data`.model.DetailDoctorModel
import org.koin.core.KoinComponent

class DetailDoctorVM : ViewModel(), KoinComponent {
  val detailDoctorModel: MutableLiveData<DetailDoctorModel> = MutableLiveData(DetailDoctorModel())

  var navArguments: Bundle? = null
}
