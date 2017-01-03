package simplefactorypattern

/**
 * Created by wenchaokong on 4/01/2017.
 */
fun main(args:Array<String>){
    val benz = CarFactory().getCar("Benz")
    val bmw = CarFactory().getCar("Bmw")
    val audi = CarFactory().getCar("Audi")
    benz.drive()
    bmw.drive()
    audi.drive()
}