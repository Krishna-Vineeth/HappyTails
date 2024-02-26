package com.happytails.app.modules.donateone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.donateone.`data`.model.DonateOneModel
import com.happytails.app.modules.donateone.`data`.model.DonateOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonateOneVM : ViewModel(), KoinComponent {
  val donateOneModel: MutableLiveData<DonateOneModel> = MutableLiveData(DonateOneModel())

  var navArguments: Bundle? = null

  val donateOneList: MutableLiveData<MutableList<DonateOneRowModel>> =
      MutableLiveData(mutableListOf())
}
