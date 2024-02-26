package com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.model.ListbodyTwoRowModel
import com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.model.ProfileHealthCardAddInsuranceStep23Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileHealthCardAddInsuranceStep23VM : ViewModel(), KoinComponent {
  val profileHealthCardAddInsuranceStep23Model:
      MutableLiveData<ProfileHealthCardAddInsuranceStep23Model> =
      MutableLiveData(ProfileHealthCardAddInsuranceStep23Model())

  var navArguments: Bundle? = null

  val listbodyTwoList: MutableLiveData<MutableList<ListbodyTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
