package com.happytails.app.modules.veterinary.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class VeterinaryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_hyderabad_indi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInLoveWithPe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lets_find_speci)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOurServices: String? = MyApp.getInstance().resources.getString(R.string.lbl_our_services)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinations: String? = MyApp.getInstance().resources.getString(R.string.lbl_vaccinations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOperations: String? = MyApp.getInstance().resources.getString(R.string.lbl_operations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBehaviorals: String? = MyApp.getInstance().resources.getString(R.string.lbl_behaviorals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDentistry: String? = MyApp.getInstance().resources.getString(R.string.lbl_dentistry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestSpecialist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_best_specialist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTeksFieldValue: String? = null
)
