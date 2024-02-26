package com.happytails.app.modules.donateone.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class DonateOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloBalaji: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_balaji2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmallchangeb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_small_change_b2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLab: String? = MyApp.getInstance().resources.getString(R.string.lbl_pet_in_covid)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_summer_thirst)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_abandon_on_road)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_clean_water)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopPrograms: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_programs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEffectiveAltru: String? =
      MyApp.getInstance().resources.getString(R.string.msg_effective_altru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_building_worksh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJustforyou: String? = MyApp.getInstance().resources.getString(R.string.lbl_just_for_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_local_programs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabTitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_globle_programs)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTabsValue: String? = null
)
