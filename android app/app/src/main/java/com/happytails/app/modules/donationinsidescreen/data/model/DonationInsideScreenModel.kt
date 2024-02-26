package com.happytails.app.modules.donationinsidescreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class DonationInsideScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtByTariroMzeze: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_tariro_mzeze)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_tariro_mzezewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhillips: String? = MyApp.getInstance().resources.getString(R.string.lbl_phillips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_phillips_was_cu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_watch_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentDooners: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_dooners)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_442)
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
  var txtElephantsdogs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elephants_dogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_due_to_the_covi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSimilarProgram: String? =
      MyApp.getInstance().resources.getString(R.string.msg_similar_program)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_me)
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
  var txtHelpMeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_me)

)
