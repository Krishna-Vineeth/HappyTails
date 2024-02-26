package com.happytails.app.modules.frame280233.`data`.model

import com.happytails.app.R
import com.happytails.app.appcomponents.di.MyApp
import kotlin.String

data class Frame280233Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrdropafile: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_drop_a_file)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasteimageor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paste_image_or)

)
