package factorypattern.abstractfactorypattern

/**
 * Created by wenchaokong on 4/01/2017.
 */
class AK47 : Gun(){
    init{
        println("create AK47")
    }
    override fun fire() {
        println("fire AK47")
    }

}