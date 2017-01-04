package factorypattern.factorymethodpattern

import factorypattern.Car

/**
 * Created by wenchaokong on 4/01/2017.
 */
abstract class AbstractCarFactory(){
    abstract fun getCarType() : Car
}