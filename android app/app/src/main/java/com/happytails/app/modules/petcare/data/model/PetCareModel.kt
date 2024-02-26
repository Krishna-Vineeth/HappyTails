package com.happytails.app.modules.petcare.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class PetCareModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThanksForHelp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thanks_for_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWatchourexclu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_watch_our_exclu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServices: String? = MyApp.getInstance().resources.getString(R.string.lbl_services)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWellnessPrev: String? = MyApp.getInstance().resources.getString(R.string.msg_wellness_prev)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGrooming: String? = MyApp.getInstance().resources.getString(R.string.lbl_grooming)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealth: String? = MyApp.getInstance().resources.getString(R.string.lbl_health2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTraining: String? = MyApp.getInstance().resources.getString(R.string.lbl_training)
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
