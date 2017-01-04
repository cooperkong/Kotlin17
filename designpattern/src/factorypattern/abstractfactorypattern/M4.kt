package factorypattern.abstractfactorypattern

/**
 * Created by wenchaokong on 4/01/2017.
 */
class M4 : Gun() {
    init{
        println("create M4")
    }

    override fun fire() {
        println("fire M4!")
    }

}