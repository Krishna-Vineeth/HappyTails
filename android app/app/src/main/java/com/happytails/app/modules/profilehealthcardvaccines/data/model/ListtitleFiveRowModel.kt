package com.happytails.app.modules.profilehealthcardvaccines.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ListtitleFiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_nobivac_parvo_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt13032021: String? = MyApp.getInstance().resources.getString(R.string.lbl_13_03_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_martha_roth)

)
