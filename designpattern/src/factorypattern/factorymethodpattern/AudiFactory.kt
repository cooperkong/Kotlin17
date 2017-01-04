package factorypattern.factorymethodpattern

import factorypattern.Audi
import factorypattern.Car

/**
 * Created by wenchaokong on 4/01/2017.
 */
class AudiFactory : AbstractCarFactory(){
    override fun getCarType(): Car {
        return Audi()
    }

}