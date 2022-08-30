package com.example.integradorkotlin

import java.util.*

const val MINUTES_IN_MILISECONDS = 60000

data class ParkingSpace(var vehicle:Vehicle){
    val plate = vehicle.plate
    val checkInTime = vehicle.checkInTime
    val parkedTime : Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis ) / MINUTES_IN_MILISECONDS
}
