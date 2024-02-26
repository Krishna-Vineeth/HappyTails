package com.happytails.app.modules.donationscreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class DonationScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDONATION: String? = MyApp.getInstance().resources.getString(R.string.lbl_donation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmallChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_small_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElephantsdogs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elephants_dogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_20_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_days_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_doantion_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRs: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntertheamoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_amoun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_5_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_50_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowoftenyouw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_often_you_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtControlsChip: String? = MyApp.getInstance().resources.getString(R.string.lbl_one_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtControlsChipOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_every_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_every_3_month)
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
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_donte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpMe: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_me)

)
