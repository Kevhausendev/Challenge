package com.example.integradorkotlin

import java.util.*
import kotlin.math.ceil

const val MINUTES_IN_MILISECONDS = 60000

data class ParkingSpace(var vehicle:Vehicle, val parking:Parking){
    val plate = vehicle.plate
    val checkInTime = vehicle.checkInTime

//    parked time in minutes
    val parkedTime : Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis ) / MINUTES_IN_MILISECONDS

    fun checkOutVehicle(plate:String,onSuccess:(Int)->Unit,onError:()->Unit){
        if(parking.isVehiclePlateParked(plate)){
            val vehicle = parking.vehicles.find { it.plate == plate }
            val hasDiscount = vehicle?.discountCard?.isNotBlank() ?: false
            val fee = vehicle?.let { calculateFee(it.type,parkedTime.toInt(),hasDiscount) } ?: 0
            onSuccess(fee)
            parking.vehicles.remove((vehicle))


        }else{
            onError()
        }


    }


    fun calculateFee(type:VehicleType, parkedTime:Int, hasDiscountCard:Boolean):Int{
        return when(type){
            VehicleType.BUS -> Utils.feeOperation(parkedTime,VehicleType.BUS.rate,hasDiscountCard)
            VehicleType.MINIBUS -> Utils.feeOperation(parkedTime,VehicleType.MINIBUS.rate,hasDiscountCard)
            VehicleType.MOTO -> Utils.feeOperation(parkedTime,VehicleType.MOTO.rate,hasDiscountCard)
            VehicleType.AUTO -> Utils.feeOperation(parkedTime,VehicleType.AUTO.rate,hasDiscountCard)
        }
    }
}
