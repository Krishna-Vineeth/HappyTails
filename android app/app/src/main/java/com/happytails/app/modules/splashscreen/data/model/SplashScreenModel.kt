package com.happytails.app.modules.splashscreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpingyouto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_helping_you_to)

)
