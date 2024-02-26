package com.happytails.app.modules.joincommunity.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class JoinCommunityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_join_a_communit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatkindofmu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_join_your_first)

)
