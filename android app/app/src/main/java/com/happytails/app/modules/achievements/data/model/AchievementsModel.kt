package com.happytails.app.modules.achievements.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class AchievementsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_great)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisyourus: String? = MyApp.getInstance().resources.getString(R.string.msg_here_are_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.msg_let_s_begin_thi)

)
