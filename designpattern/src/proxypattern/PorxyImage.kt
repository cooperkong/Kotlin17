package proxypattern

/**
 * Created by wenchaokong on 15/01/2017.
 */
class PorxyImage(var fileName: String) : Image{

    var realImage : RealImage? = null

    override fun display() {
        if(realImage == null)
            realImage = RealImage(fileName)
        realImage?.display()
    }

}