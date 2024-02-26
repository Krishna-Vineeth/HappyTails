package com.happytails.app.modules.mainmenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.mainmenu.`data`.model.MainMenuModel
import org.koin.core.KoinComponent

class MainMenuVM : ViewModel(), KoinComponent {
  val mainMenuModel: MutableLiveData<MainMenuModel> = MutableLiveData(MainMenuModel())

  var navArguments: Bundle? = null
}
