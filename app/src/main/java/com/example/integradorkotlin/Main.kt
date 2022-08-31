package com.example.integradorkotlin

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main(){
    val parking = Parking(mutableSetOf())

    val car = Vehicle("AAA",VehicleType.AUTO,Calendar.getInstance(),"CARD_001")

    val carParking = ParkingSpace(car,parking)
    val moto = Vehicle("AAB",VehicleType.MOTO,Calendar.getInstance())
    val minibus = Vehicle("AAC",VehicleType.MINIBUS,Calendar.getInstance())
    val bus = Vehicle("AAD",VehicleType.BUS,Calendar.getInstance(),"CARD_002")
    val car1 = Vehicle("AAF",VehicleType.AUTO,Calendar.getInstance(),"CARD_003")
    val moto1 = Vehicle("AAG",VehicleType.MOTO,Calendar.getInstance())
    val minibus1 = Vehicle("AAH",VehicleType.MINIBUS,Calendar.getInstance())
    val bus1 = Vehicle("AAI",VehicleType.BUS,Calendar.getInstance(),"CARD_004")
    val car2 = Vehicle("AAJ",VehicleType.AUTO,Calendar.getInstance(),"CARD_005")
    val moto2 = Vehicle("AAK",VehicleType.MOTO,Calendar.getInstance())
    val minibus2 = Vehicle("AAL",VehicleType.MINIBUS,Calendar.getInstance())
    val bus2 = Vehicle("AAM",VehicleType.BUS,Calendar.getInstance(),"CARD_006")
    val car3 = Vehicle("AAN",VehicleType.AUTO,Calendar.getInstance(),"CARD_007")
    val moto3 = Vehicle("AAO",VehicleType.MOTO,Calendar.getInstance())
    val minibus3 = Vehicle("AAP",VehicleType.MINIBUS,Calendar.getInstance())
    val bus3 = Vehicle("AAQ",VehicleType.BUS,Calendar.getInstance(),"CARD_008")
    val car4 = Vehicle("AAR",VehicleType.AUTO,Calendar.getInstance(),"CARD_009")
    val moto4 = Vehicle("AAS",VehicleType.MOTO,Calendar.getInstance())
    val minibus4 = Vehicle("AAT",VehicleType.MINIBUS,Calendar.getInstance())
    val bus4 = Vehicle("AAU",VehicleType.BUS,Calendar.getInstance(),"CARD_010")

    val vehicleList = mutableSetOf(car,car1,car2,car3,car4,moto,
        moto1,moto2,moto3,moto4,bus,bus1,bus2,bus3,bus4,minibus,
        minibus1,minibus2,minibus3,minibus4)

//    vehicleList.forEach{
//        parking.addVehicle(it)
//    }
    parking.addVehicle(car.copy(plate = "BBB"))

    val horas : Double = 195.0
    val rate = 20
    val extraFee = 5
    val tarifa = if(horas <=120) rate else (ceil((horas - 120.0) / 15.0)).toInt() * extraFee + rate
    val letras = null
    println(letras?.isNotBlank())

    val curenta = 45
    println(curenta*0.85)

    println(Utils.feeOperation(horas.toInt(),rate,true))
    println(tarifa)








    fun checkInVehicles(){
        for(i in 1..22){
            val differentPlate = "AA$i"
            parking.addVehicle(car.copy(plate=differentPlate))
        }
    }



}