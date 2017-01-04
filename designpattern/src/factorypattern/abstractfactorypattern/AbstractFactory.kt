package factorypattern.abstractfactorypattern

import factorypattern.Car

/**
 * Created by wenchaokong on 4/01/2017.
 */
abstract class AbstractFactory{
    abstract fun getGun() : Gun
    abstract fun getCar() : Car
}
