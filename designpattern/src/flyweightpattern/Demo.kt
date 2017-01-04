package flyweightpattern

import factorypattern.Car
import java.util.*

/**
 * Created by wenchaokong on 4/01/2017.
 */
fun main (args : Array<String>){
    val cars = arrayOf("Bmw", "Audi", "Benz")
    var car: Car
    val rg : Random = Random()

    for ( i in 1..10) {
        car = FlyweightFactory().getCar(cars[rg.nextInt(3)])
        car.drive()
    }
    println("total car created, ${FlyweightFactory().getSum()}")
}