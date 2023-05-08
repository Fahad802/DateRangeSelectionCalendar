package com.example.daterangeselectioncalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daterangeselectioncalendar.databinding.ActivityMainBinding
import dev.joshhalvorson.calendar_date_range_picker.calendar.model.CalendarEvent
import java.text.DateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getDateRangeButton.setOnClickListener {
            val selectedDates = binding.calendarPicker.getSelectedDates()
            if (selectedDates != null) {
                val firstDate = DateFormat.getDateInstance().format(Date(selectedDates.first))
                val secondDate = DateFormat.getDateInstance().format(Date(selectedDates.second))
                Toast.makeText(this, "$firstDate   $secondDate", Toast.LENGTH_SHORT).show()
            }
        }

//        binding.calendarPicker.addEvents(
//            CalendarEvent(
//                eventName = "event  1",
//                eventDescription = "event 1 desc",
//                date = Calendar.getInstance().time
//            ),
//            CalendarEvent(
//                eventName = "event  2",
//                eventDescription = "event 2 desc",
//                date = Calendar.Builder().setDate(2021, 8, 19).build().time
//            ),
//            CalendarEvent(
//                eventName = "event  3",
//                eventDescription = "event 3 desc",
//                date = Calendar.Builder().setDate(2021, 8, 1).build().time
//            ),
//            CalendarEvent(
//                eventName = "event  4",
//                eventDescription = "event 4 desc",
//                date = Calendar.Builder().setDate(2021, 11, 10).build().time
//            ),
//            CalendarEvent(
//                eventName = "event  5",
//                eventDescription = "event 5 desc",
//                date = Calendar.Builder().setDate(2021, 0, 29).build().time
//            ),
//        )

//        binding.calendarPicker.setFirstSelectedDate(year = 2021, month = 8, day = 9)
//        binding.calendarPicker.setSecondSelectedDate(year = 2021, month = 8, day = 19)
//
//        binding.calendarPicker.initCalendar() // REFRESHES CALENDAR AFTER SELECTING DATES


        customizeBarChart()
    }

    private fun customizeBarChart() {

        val lH = resources.displayMetrics.heightPixels
        val lW = resources.displayMetrics.widthPixels

        Log.d("LHW", "$lH   $lW")

        val view1 = View(this)
        view1.layoutParams = LinearLayout.LayoutParams(lW/3, LayoutParams.MATCH_PARENT)
        view1.setBackgroundColor(getColor(R.color.purple_200))
        binding.customizeBarChart.addView(view1)

        val view2 = View(this)
        view2.layoutParams = LinearLayout.LayoutParams(lW/5, LayoutParams.MATCH_PARENT)
        view2.setBackgroundColor(getColor(R.color.purple_500))
        view2.setMargins(5, 0,0,0)
        binding.customizeBarChart.addView(view2)

        val view3 = View(this)
        view3.layoutParams = LinearLayout.LayoutParams(lW/6, LayoutParams.MATCH_PARENT)
        view3.setBackgroundColor(getColor(R.color.purple_700))
        view3.setMargins(5, 0,0,0)
        binding.customizeBarChart.addView(view3)

        val view4 = View(this)
        view4.layoutParams = LinearLayout.LayoutParams(lW/7, LayoutParams.MATCH_PARENT)
        view4.setBackgroundColor(getColor(R.color.purple_200))
        view4.setMargins(5, 0,0,0)
        binding.customizeBarChart.addView(view4)

        val view5 = View(this)
        view5.layoutParams = LinearLayout.LayoutParams(lW/8, LayoutParams.MATCH_PARENT)
        view5.setBackgroundColor(getColor(R.color.purple_700))
        view5.setMargins(5, 0,0,0)
        binding.customizeBarChart.addView(view5)
    }
}