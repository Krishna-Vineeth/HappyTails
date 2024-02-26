package com.happytails.app.modules.donationscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.donationscreen.`data`.model.DonationScreenModel
import org.koin.core.KoinComponent

class DonationScreenVM : ViewModel(), KoinComponent {
  val donationScreenModel: MutableLiveData<DonationScreenModel> =
      MutableLiveData(DonationScreenModel())

  var navArguments: Bundle? = null
}
