package com.happytails.app.modules.profilehealthcardaddinsurancestep13.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardaddinsurancestep13.`data`.model.ProfileHealthCardAddInsuranceStep13Model
import org.koin.core.KoinComponent

class ProfileHealthCardAddInsuranceStep13VM : ViewModel(), KoinComponent {
  val profileHealthCardAddInsuranceStep13Model:
      MutableLiveData<ProfileHealthCardAddInsuranceStep13Model> =
      MutableLiveData(ProfileHealthCardAddInsuranceStep13Model())

  var navArguments: Bundle? = null
}
