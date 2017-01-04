package flyweightpattern

import factorypattern.Car
import factorypattern.simplefactorypattern.CarFactory
import java.util.*

/**
 * Created by wenchaokong on 4/01/2017.
 */
class FlyweightFactory {

    companion object{
        private var factory : HashMap<String, Car> = HashMap()
    }

    fun getCar(name: String) : Car{
        var car = factory.get(name)
        if(car == null){
            car = CarFactory().getCar(name)
            factory.put(name, car)
        }
        return car
    }

    fun getSum() : Int{
        return factory.size
    }
}