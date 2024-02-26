package com.happytails.app.modules.signup.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_addres)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_password_confir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBycontinuingy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_continuing_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContentValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContentOneValue: String? = null
)
