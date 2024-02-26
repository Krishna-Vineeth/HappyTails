package com.happytails.app.modules.mainmenu.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class MainMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloBalaji: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_balaji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodMorning: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_morning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInLoveWithPe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_love_with_pe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatures: String? = MyApp.getInstance().resources.getString(R.string.lbl_features)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPetAdoption: String? = MyApp.getInstance().resources.getString(R.string.lbl_pet_adoption)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVeterinary: String? = MyApp.getInstance().resources.getString(R.string.lbl_veterinary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPetCareCentre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pet_care_centre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonate: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdoptapet: String? = MyApp.getInstance().resources.getString(R.string.lbl_adopt_a_pet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsConsultT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_furry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonateOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsConsultTOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_donation_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtService: String? = MyApp.getInstance().resources.getString(R.string.lbl_community)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpme: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_me2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTeksFieldValue: String? = null
)
