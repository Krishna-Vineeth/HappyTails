package com.happytails.app.modules.achievements.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class AchievementsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBalancedDiet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_donation_you_ma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalancedDietOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_adopted_pet_s)

)
