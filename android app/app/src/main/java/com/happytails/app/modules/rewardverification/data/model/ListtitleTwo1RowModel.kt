package com.happytails.app.modules.rewardverification.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ListtitleTwo1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmallText: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBigText: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)

)
