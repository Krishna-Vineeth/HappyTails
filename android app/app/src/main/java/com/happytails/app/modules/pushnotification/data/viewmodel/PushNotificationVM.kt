package com.happytails.app.modules.pushnotification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.pushnotification.`data`.model.PushNotificationModel
import org.koin.core.KoinComponent

class PushNotificationVM : ViewModel(), KoinComponent {
  val pushNotificationModel: MutableLiveData<PushNotificationModel> =
      MutableLiveData(PushNotificationModel())

  var navArguments: Bundle? = null
}
