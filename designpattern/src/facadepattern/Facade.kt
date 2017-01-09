package facadepattern

/**
 * Created by wenchaokong on 10/01/2017.
 */
class Facade{
    private  val light1 = Light()
    private  val light2 = Light()
    private  val light3 = Light()
    private  val tv = Tv()
    private  val heater = Heater()

    fun turnOn(){
        light1.turnOn()
        light2.turnOn()
        light3.turnOn()
        tv.turnOn()
        heater.turnOn()
    }
}