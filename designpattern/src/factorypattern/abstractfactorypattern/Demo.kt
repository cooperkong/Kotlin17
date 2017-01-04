package factorypattern.abstractfactorypattern

/**
 * Created by wenchaokong on 4/01/2017.
 */
fun main (args : Array<String>){
    val car = AudiFactory().getCar()
    val gun = AudiFactory().getGun()
    car.drive()
    gun.fire()
}