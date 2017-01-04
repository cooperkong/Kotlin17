package factorypattern.abstractfactorypattern

import factorypattern.Audi
import factorypattern.Car

/**
 * Created by wenchaokong on 4/01/2017.
 */
class AudiFactory : AbstractFactory(){
    override fun getCar(): Car {
        return Audi()
    }

    override fun getGun(): Gun {
        return AK47()
    }

}