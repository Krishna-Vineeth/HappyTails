package com.happytails.app.modules.detaildoctor.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class DetailDoctorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVeterinary: String? = MyApp.getInstance().resources.getString(R.string.lbl_veterinary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrBillyMaria: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dr_billy_maria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVeterinaryBeha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_veterinary_beha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperience: String? = MyApp.getInstance().resources.getString(R.string.lbl_experience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_years)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperienceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExperienceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_5_km2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.msg_dr_maria_naiis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableDays: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_available_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOctoberCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_october_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSatCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSunCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTueCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableTime: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_available_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentTwoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentTwoTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_location)

)
