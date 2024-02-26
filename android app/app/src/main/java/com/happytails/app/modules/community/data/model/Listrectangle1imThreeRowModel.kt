package com.happytails.app.modules.community.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectangle1imThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConnorFrazierThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ellen_lambert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_11_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatkindofmuThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cool_let_s_m)

)
