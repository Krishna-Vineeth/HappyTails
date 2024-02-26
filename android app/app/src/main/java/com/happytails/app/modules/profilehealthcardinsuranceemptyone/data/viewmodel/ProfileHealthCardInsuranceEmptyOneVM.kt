package com.happytails.app.modules.profilehealthcardinsuranceemptyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardinsuranceemptyone.`data`.model.ProfileHealthCardInsuranceEmptyOneModel
import org.koin.core.KoinComponent

class ProfileHealthCardInsuranceEmptyOneVM : ViewModel(), KoinComponent {
  val profileHealthCardInsuranceEmptyOneModel:
      MutableLiveData<ProfileHealthCardInsuranceEmptyOneModel> =
      MutableLiveData(ProfileHealthCardInsuranceEmptyOneModel())

  var navArguments: Bundle? = null
}
