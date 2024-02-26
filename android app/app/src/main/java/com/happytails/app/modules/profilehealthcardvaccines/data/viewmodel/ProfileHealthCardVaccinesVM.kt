package com.happytails.app.modules.profilehealthcardvaccines.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ListtitleFiveRowModel
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ListtitleTwoRowModel
import com.happytails.app.modules.profilehealthcardvaccines.`data`.model.ProfileHealthCardVaccinesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileHealthCardVaccinesVM : ViewModel(), KoinComponent {
  val profileHealthCardVaccinesModel: MutableLiveData<ProfileHealthCardVaccinesModel> =
      MutableLiveData(ProfileHealthCardVaccinesModel())

  var navArguments: Bundle? = null

  val listtitleTwoList: MutableLiveData<MutableList<ListtitleTwoRowModel>> =
      MutableLiveData(mutableListOf())

  val listtitleFiveList: MutableLiveData<MutableList<ListtitleFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
