package flyweightpattern

import factorypattern.Car
import factorypattern.simplefactorypattern.CarFactory
import java.util.*

/**
 * Created by wenchaokong on 4/01/2017.
 *
优点
1、享元模式的优点在于它能够极大的减少系统中对象的个数。
2、享元模式由于使用了外部状态，外部状态相对独立，不会影响到内部状态，所以享元模式使得享元对象能够在不同的环境被共享。
缺点
1、由于享元模式需要区分外部状态和内部状态，使得应用程序在某种程度上来说更加复杂化了。
2、为了使对象可以共享，享元模式需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。
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