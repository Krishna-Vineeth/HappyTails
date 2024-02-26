package com.happytails.app.modules.profile.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditprofile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurity: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyAchievements: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_achievements)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSupportAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_support_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMySubscription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_subscription)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCachecellula: String? = MyApp.getInstance().resources.getString(R.string.msg_cache_cellula)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeupspace: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_up_space)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataSaver: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_saver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActions: String? = MyApp.getInstance().resources.getString(R.string.lbl_actions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReportaproble: String? =
      MyApp.getInstance().resources.getString(R.string.msg_report_a_proble)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
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
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_me)

)
