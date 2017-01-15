package proxypattern

/**
 * Created by wenchaokong on 15/01/2017.
 */
class RealImage(var filename : String) : Image{

    init{
        loadFromDisk(filename)
    }

    override fun display() {
        println("displaying $filename")
    }

    private fun loadFromDisk(name : String){
        println("loading $name")
    }

}