package com.happytails.app.modules.petinfo.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class PetinfoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutItachi: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_itachi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_5_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_height)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_42_cm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrown: String? = MyApp.getInstance().resources.getString(R.string.lbl_brown)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMydogisincre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_dog_is_incre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItachibehavior: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_itachi_behavior)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhillips: String? = MyApp.getInstance().resources.getString(R.string.lbl_phillips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmericanShorth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_american_shorth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_6m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocate: String? = MyApp.getInstance().resources.getString(R.string.lbl_locate)

)
