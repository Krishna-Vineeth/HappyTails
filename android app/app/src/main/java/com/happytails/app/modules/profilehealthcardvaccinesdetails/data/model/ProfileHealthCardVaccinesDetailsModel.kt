package com.happytails.app.modules.profilehealthcardvaccinesdetails.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileHealthCardVaccinesDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_nobivac_parvo_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBody: String? = MyApp.getInstance().resources.getString(R.string.lbl_lot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueUnit: String? = MyApp.getInstance().resources.getString(R.string.lbl_a583d01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueUnitOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_07_2026)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_vaccination_dat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueUnitTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_05_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_valid_until)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueUnitThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_09_2025)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_veterinarian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_martha_roth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyFour: String? = MyApp.getInstance().resources.getString(R.string.msg_veterinary_spec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_notes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueUnitFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_bad_reaction)

)
