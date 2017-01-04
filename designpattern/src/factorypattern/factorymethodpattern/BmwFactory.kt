package factorypattern.factorymethodpattern

import factorypattern.Bmw
import factorypattern.Car

/**
 * Created by wenchaokong on 4/01/2017.
 */
class BmwFactory : AbstractCarFactory(){
    override fun getCarType(): Car {
        return Bmw()
    }

}