package com.happytails.app.modules.profilehealthcardinsuranceempty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardinsuranceempty.`data`.model.ProfileHealthCardInsuranceEmptyModel
import org.koin.core.KoinComponent

class ProfileHealthCardInsuranceEmptyVM : ViewModel(), KoinComponent {
  val profileHealthCardInsuranceEmptyModel: MutableLiveData<ProfileHealthCardInsuranceEmptyModel> =
      MutableLiveData(ProfileHealthCardInsuranceEmptyModel())

  var navArguments: Bundle? = null
}
