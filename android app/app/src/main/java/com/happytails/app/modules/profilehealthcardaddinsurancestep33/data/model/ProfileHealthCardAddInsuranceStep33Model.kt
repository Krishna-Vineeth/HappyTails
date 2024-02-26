package com.happytails.app.modules.profilehealthcardaddinsurancestep33.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileHealthCardAddInsuranceStep33Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_insurance2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_it_works)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_take_your_pet_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyThree: String? = MyApp.getInstance().resources.getString(R.string.msg_visit_any_licen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyFour: String? = MyApp.getInstance().resources.getString(R.string.msg_send_us_your_cl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyFive: String? = MyApp.getInstance().resources.getString(R.string.msg_pay_your_pet_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodySix: String? = MyApp.getInstance().resources.getString(R.string.msg_get_money_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodySeven: String? = MyApp.getInstance().resources.getString(R.string.msg_we_will_follow)

)
