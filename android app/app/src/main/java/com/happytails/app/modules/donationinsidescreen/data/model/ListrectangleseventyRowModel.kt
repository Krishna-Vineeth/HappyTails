package com.happytails.app.modules.donationinsidescreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectangleseventyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCapacityBuildi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_capacity_buildi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_85000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_55)

)
