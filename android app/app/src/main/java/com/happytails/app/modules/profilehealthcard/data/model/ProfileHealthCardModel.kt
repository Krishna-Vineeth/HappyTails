package com.happytails.app.modules.profilehealthcard.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileHealthCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_pet_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_balaji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTab: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_health)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_nutrition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_activities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_insurance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_vaccines)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleThree: String? = MyApp.getInstance().resources.getString(R.string.msg_anti_parasitica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFour: String? = MyApp.getInstance().resources.getString(R.string.msg_medical_interve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFive: String? = MyApp.getInstance().resources.getString(R.string.msg_other_treatment)
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

)
