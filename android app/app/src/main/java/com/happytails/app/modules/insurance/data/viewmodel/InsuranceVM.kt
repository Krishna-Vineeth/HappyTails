package com.happytails.app.modules.insurance.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.insurance.`data`.model.InsuranceModel
import org.koin.core.KoinComponent

class InsuranceVM : ViewModel(), KoinComponent {
  val insuranceModel: MutableLiveData<InsuranceModel> = MutableLiveData(InsuranceModel())

  var navArguments: Bundle? = null
}
