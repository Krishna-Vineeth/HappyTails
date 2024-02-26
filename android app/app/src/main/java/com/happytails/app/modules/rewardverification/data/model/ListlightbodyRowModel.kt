package com.happytails.app.modules.rewardverification.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ListlightbodyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_9346830134)

)
