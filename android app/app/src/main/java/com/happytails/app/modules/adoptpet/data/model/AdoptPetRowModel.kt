package com.happytails.app.modules.adoptpet.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class AdoptPetRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLouis: String? = MyApp.getInstance().resources.getString(R.string.lbl_louis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnAmericanLab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_an_american_lab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_know_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhillips: String? = MyApp.getInstance().resources.getString(R.string.lbl_phillips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSevenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_know_more)

)
