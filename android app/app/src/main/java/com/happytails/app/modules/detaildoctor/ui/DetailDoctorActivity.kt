package com.happytails.app.modules.detaildoctor.ui

import androidx.activity.viewModels
import com.happytails.app.R
import com.happytails.app.appcomponents.base.BaseActivity
import com.happytails.app.databinding.ActivityDetailDoctorBinding
import com.happytails.app.modules.detaildoctor.`data`.viewmodel.DetailDoctorVM
import com.happytails.app.modules.trackmap.ui.TrackMapActivity
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class DetailDoctorActivity :
    BaseActivity<ActivityDetailDoctorBinding>(R.layout.activity_detail_doctor) {
  private val viewModel: DetailDoctorVM by viewModels<DetailDoctorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.calendarFi.setOnDateChangedListener { widget, date, selected ->
      onSingleDateSelectedCalendarFi(widget, date, selected)
    }
    binding.detailDoctorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButton.setOnClickListener {
      val destIntent = TrackMapActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun onSingleDateSelectedCalendarFi(
    widget: MaterialCalendarView,
    date: CalendarDay,
    selected: Boolean
  ): Unit {
  }

  companion object {
    const val TAG: String = "DETAIL_DOCTOR_ACTIVITY"

  }
}
