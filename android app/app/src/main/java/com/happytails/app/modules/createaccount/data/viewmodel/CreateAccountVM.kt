package com.happytails.app.modules.createaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.createaccount.`data`.model.CreateAccountModel
import org.koin.core.KoinComponent

class CreateAccountVM : ViewModel(), KoinComponent {
  val createAccountModel: MutableLiveData<CreateAccountModel> =
      MutableLiveData(CreateAccountModel())

  var navArguments: Bundle? = null
}
