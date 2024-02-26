package com.happytails.app.modules.rewardsystem.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class RewardSystemModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_contact)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBodyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_street)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBodyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_type_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBodyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBodyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBodyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBodyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_type_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.msg_check_your_rewa)

)
