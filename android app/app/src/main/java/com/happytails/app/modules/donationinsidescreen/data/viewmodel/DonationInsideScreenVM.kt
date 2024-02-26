package com.happytails.app.modules.donationinsidescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.donationinsidescreen.`data`.model.DonationInsideScreenModel
import com.happytails.app.modules.donationinsidescreen.`data`.model.ListrectangleseventyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonationInsideScreenVM : ViewModel(), KoinComponent {
  val donationInsideScreenModel: MutableLiveData<DonationInsideScreenModel> =
      MutableLiveData(DonationInsideScreenModel())

  var navArguments: Bundle? = null

  val listrectangleseventyList: MutableLiveData<MutableList<ListrectangleseventyRowModel>> =
      MutableLiveData(mutableListOf())
}
