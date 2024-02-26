package com.happytails.app.modules.pushnotification.ui

import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityPushNotificationBinding
import com.happytails.app.modules.pushnotification.`data`.viewmodel.PushNotificationVM
import kotlin.String
import kotlin.Unit

class PushNotificationActivity :
    BaseActivity<ActivityPushNotificationBinding>(R.layout.activity_push_notification) {
  private val viewModel: PushNotificationVM by viewModels<PushNotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pushNotificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PUSH_NOTIFICATION_ACTIVITY"

  }
}
