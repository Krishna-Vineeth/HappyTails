package com.happytails.app.modules.adoptpet.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class AdoptPetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdoptapet: String? = MyApp.getInstance().resources.getString(R.string.lbl_adopt_a_pet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_select_any_pet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrowseMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_browse_more)
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

)
