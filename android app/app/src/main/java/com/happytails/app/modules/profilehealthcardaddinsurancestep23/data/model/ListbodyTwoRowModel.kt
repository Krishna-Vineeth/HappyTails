package com.happytails.app.modules.profilehealthcardaddinsurancestep23.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ListbodyTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBodyTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_accidents_and_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValueUnit: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_000)

)
