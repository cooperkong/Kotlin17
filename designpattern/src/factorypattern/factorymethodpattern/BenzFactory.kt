package factorypattern.factorymethodpattern

import factorypattern.simplefactorypattern.Benz
import factorypattern.simplefactorypattern.Car

/**
 * Created by wenchaokong on 4/01/2017.
 */
class BenzFactory : AbstractCarFactory(){
    override fun getCarType(): Car {
        return Benz()
    }
}