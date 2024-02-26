package com.happytails.app.modules.launchscreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class LaunchScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSmallchangeb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_small_change_b)

)
