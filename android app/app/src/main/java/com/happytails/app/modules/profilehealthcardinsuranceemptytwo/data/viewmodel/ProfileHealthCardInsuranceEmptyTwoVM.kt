package com.happytails.app.modules.profilehealthcardinsuranceemptytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardinsuranceemptytwo.`data`.model.ProfileHealthCardInsuranceEmptyTwoModel
import org.koin.core.KoinComponent

class ProfileHealthCardInsuranceEmptyTwoVM : ViewModel(), KoinComponent {
  val profileHealthCardInsuranceEmptyTwoModel:
      MutableLiveData<ProfileHealthCardInsuranceEmptyTwoModel> =
      MutableLiveData(ProfileHealthCardInsuranceEmptyTwoModel())

  var navArguments: Bundle? = null
}
