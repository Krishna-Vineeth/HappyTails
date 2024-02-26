package com.happytails.app.modules.achievements.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.happytails.app.modules.achievements.`data`.model.AchievementsModel
import com.happytails.app.modules.achievements.`data`.model.AchievementsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AchievementsVM : ViewModel(), KoinComponent {
  val achievementsModel: MutableLiveData<AchievementsModel> = MutableLiveData(AchievementsModel())

  var navArguments: Bundle? = null

  val achievementsList: MutableLiveData<MutableList<AchievementsRowModel>> =
      MutableLiveData(mutableListOf())
}
