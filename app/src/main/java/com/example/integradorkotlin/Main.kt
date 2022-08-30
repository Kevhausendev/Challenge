package com.example.integradorkotlin

import java.util.*

fun main(){
    val listadoVehiculos = mutableSetOf<Vehicle>()

    val fechaIngreso = Calendar.getInstance()
    val car = Vehicle("DGGH45",VehicleType.AUTO)

    println(car.checkInTime.time)
}