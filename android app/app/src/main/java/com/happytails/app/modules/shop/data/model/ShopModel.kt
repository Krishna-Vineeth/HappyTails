package com.happytails.app.modules.shop.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ShopModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloSarah: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_sarah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindyourlovab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_lovab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCommunity: String? = MyApp.getInstance().resources.getString(R.string.lbl_community)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonate: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTeksFieldValue: String? = null
)
