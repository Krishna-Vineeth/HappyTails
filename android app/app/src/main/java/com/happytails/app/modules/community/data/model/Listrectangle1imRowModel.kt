package com.happytails.app.modules.community.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectangle1imRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConnorFrazier: String? = MyApp.getInstance().resources.getString(R.string.lbl_trent_will)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_louis_is_always)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_11_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatkindofmu: String? = MyApp.getInstance().resources.getString(R.string.lbl_16)

)
