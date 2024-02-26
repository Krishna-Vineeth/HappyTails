package com.happytails.app.modules.normalscreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class NormalScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.msg_wednesday_7_sep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_41)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_wh_1000xm5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_26)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCameraIcon: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCameraIconOne: String? = MyApp.getInstance().resources.getString(R.string.lbl2)

)
