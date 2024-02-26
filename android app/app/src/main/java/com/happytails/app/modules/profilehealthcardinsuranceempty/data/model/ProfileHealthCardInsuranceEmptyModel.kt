package com.happytails.app.modules.profilehealthcardinsuranceempty.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileHealthCardInsuranceEmptyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_pet_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_balaji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_insurance_added)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_insurance)

)
