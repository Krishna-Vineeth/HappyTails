package com.happytails.app.modules.petcare.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class PetCareRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLouis: String? = MyApp.getInstance().resources.getString(R.string.lbl_louis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_louis_was_curre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_watch_more)

)
