package com.happytails.app.modules.rewardsystem.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class RewardSystemRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBody: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_your_phon)

)
