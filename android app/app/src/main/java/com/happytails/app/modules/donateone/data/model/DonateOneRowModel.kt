package com.happytails.app.modules.donateone.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class DonateOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtElephantsdogs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elephants_dogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_85000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_55)

)
