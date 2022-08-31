package com.example.integradorkotlin

import java.util.*

/**
 * @author: Kevin
 * @param vehicle is an instance of Vehicle
* */

data class Vehicle(
    val plate:String,
    val type:VehicleType,
    val checkInTime:Calendar,
    val discountCard :String? = null){

//    se podria poner el checkInTime como atributo? no se si es necesario pasarle el calendar.getinstance() cada vez
//    val checkinTime = Calendar.getInstance()

    //    Function states that two Vehicles are equal if their plates are
    override fun equals(other: Any?): Boolean {
        if(other is Vehicle){
            return this.plate == other.plate
        }
        return super.equals(other)

    }

    //    Function states that the hashcode will be generated considering
//    only the plate value (and not time or other values)
    override fun hashCode(): Int = this.plate.hashCode()
}
