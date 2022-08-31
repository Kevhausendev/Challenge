package com.example.integradorkotlin

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

/**
 * @author Kevin von Hausen
 * @param feeOperation function that calculates fee of vehicle depending on parked time and rate of specific vehicle type.
 * For the first two hours, the fee is flat. For every 15 minutes after two hours, the fee increases
 * by $5.
 * If vehicle has a discount card, the fee is decreased by 15%.
 * */

object Utils {

    fun feeOperation(parkedTime: Int, rate: Int, hasDiscount : Boolean):Int{
//        Parsing Ints to Double and declaring constants as Doubles to calculate fee.
        val rateDouble = rate.toDouble()
        val parkedTimeDouble = parkedTime.toDouble()
        val initialFeeTime = 120.0
        val extraFee = 5.0
        val quarterOfHour = 15.0

//        Multiplies the fee by one (no discount), or by 0,85 (15% discount).
        val discountRate : Double = if(hasDiscount) 0.85 else 1.0

//        Return flat fee if time is less that two hours. Flat fee + extra if more than two.
        return if(parkedTimeDouble <= initialFeeTime) (rateDouble*discountRate).toInt()
        else (round((ceil((parkedTimeDouble - initialFeeTime) / quarterOfHour)
                * extraFee + rateDouble) * discountRate)).toInt()
    }

}