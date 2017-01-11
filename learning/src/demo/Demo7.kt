package demo

import java.math.BigInteger

/**
 * Created by wenchaokong on 11/01/2017.
 */

data class Result(var number : BigInteger = BigInteger.valueOf(1L))

tailrec fun factorial(number : Int, result : Result){
    if(number == 0) result.number = result.number.times(BigInteger.valueOf(1L))
    else{
        result.number = result.number.times(BigInteger.valueOf((number ).toLong()))
        factorial(number - 1, result)
    }
}

fun main (args : Array<String>){
    val result = Result()
    println(factorial(5, result))
    println(result)
}