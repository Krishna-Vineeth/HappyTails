package com.happytails.app.modules.profilehealthcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcard.`data`.model.ProfileHealthCardModel
import org.koin.core.KoinComponent

class ProfileHealthCardVM : ViewModel(), KoinComponent {
  val profileHealthCardModel: MutableLiveData<ProfileHealthCardModel> =
      MutableLiveData(ProfileHealthCardModel())

  var navArguments: Bundle? = null
}
