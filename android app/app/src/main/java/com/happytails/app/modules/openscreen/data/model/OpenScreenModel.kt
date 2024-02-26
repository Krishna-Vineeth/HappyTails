package com.happytails.app.modules.openscreen.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class OpenScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPetCareInYou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pet_care_in_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConnectwithFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_connect_with_5)

)
