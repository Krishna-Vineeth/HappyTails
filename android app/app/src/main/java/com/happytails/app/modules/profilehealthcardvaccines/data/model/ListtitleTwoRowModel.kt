package com.happytails.app.modules.profilehealthcardvaccines.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ListtitleTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_nobivac_parvo_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt13032023: String? = MyApp.getInstance().resources.getString(R.string.lbl_13_03_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_martha_roth)

)
