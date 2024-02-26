package com.happytails.app.modules.veterinary.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class VeterinaryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMariaNai: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_billy_maria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVeterinaryDent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_veterinary_beha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_km)

)
