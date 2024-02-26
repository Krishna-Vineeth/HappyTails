package com.happytails.app.modules.profilehealthcardvaccines.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileHealthCardVaccinesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_pet_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_vaccines)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_balaji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_nobivac_parvo_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt11022024: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_02_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_martha_roth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2022)

)
