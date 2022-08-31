package com.example.integradorkotlin


data class Parking(val vehicles : MutableSet<Vehicle>) {
//    Max capacity of AlkeParking
    val maxRoom = 20
    /**
     * @param addVehicle
     * Function that adds vehicle to the set if doesn't exist on the records
     * and if there's enough room
     * **/
    fun addVehicle(vehicle:Vehicle):Boolean{
        return if(vehicles.size<maxRoom && !vehicles.contains(vehicle)) {
            vehicles.add(vehicle)
            println("Welcome to AlkeParking!")
            true
        }else{
            println("Sorry, the check-in failed")
            false
        }
    }

    /**
     * @param isVehicleParked
     * Function that check by plate, if the vehicle is already parked
     * **/
    fun isVehiclePlateParked(plate: String):Boolean{
        return vehicles.any { it.plate == plate }
    }


}