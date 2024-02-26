package com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileHealthCardAddInsuranceStep23Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_insurance2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_package_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoldBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_comfy_pack)

)
