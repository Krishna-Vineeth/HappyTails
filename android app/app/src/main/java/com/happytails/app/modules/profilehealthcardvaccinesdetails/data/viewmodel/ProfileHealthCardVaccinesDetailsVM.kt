package com.happytails.app.modules.profilehealthcardvaccinesdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardvaccinesdetails.`data`.model.ProfileHealthCardVaccinesDetailsModel
import org.koin.core.KoinComponent

class ProfileHealthCardVaccinesDetailsVM : ViewModel(), KoinComponent {
  val profileHealthCardVaccinesDetailsModel: MutableLiveData<ProfileHealthCardVaccinesDetailsModel>
      = MutableLiveData(ProfileHealthCardVaccinesDetailsModel())

  var navArguments: Bundle? = null
}
