package factorypattern.simplefactorypattern

/**
 * Created by wenchaokong on 4/01/2017.
 */
class CarFactory{

    fun getCar(carTyoe : String) : Car{
        when(carTyoe){
            "Benz" -> return Benz()
            "Bmw" -> return Bmw()
            "Audi" -> return Audi()
            else -> {
                throw Exception("type not supported")
            }
        }
    }
}