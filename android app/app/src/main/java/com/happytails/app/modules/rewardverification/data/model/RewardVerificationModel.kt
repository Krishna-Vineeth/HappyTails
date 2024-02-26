package com.happytails.app.modules.rewardverification.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class RewardVerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_contact)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_jimmy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyOne: String? = MyApp.getInstance().resources.getString(R.string.msg_hussain_sagar)
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
  var txtBoldBody: String? = MyApp.getInstance().resources.getString(R.string.msg_balaji_rao_pet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBodyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBodyOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hussain_sagar_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBodyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBodyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hyderabad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_reward)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.msg_share_your_feed)

)
