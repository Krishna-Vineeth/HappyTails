package com.happytails.app.modules.profilehealthcardaddinsurancestep33.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardaddinsurancestep33.`data`.model.ProfileHealthCardAddInsuranceStep33Model
import org.koin.core.KoinComponent

class ProfileHealthCardAddInsuranceStep33VM : ViewModel(), KoinComponent {
  val profileHealthCardAddInsuranceStep33Model:
      MutableLiveData<ProfileHealthCardAddInsuranceStep33Model> =
      MutableLiveData(ProfileHealthCardAddInsuranceStep33Model())

  var navArguments: Bundle? = null
}
