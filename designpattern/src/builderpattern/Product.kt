package builderpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class Product{
    var name : String = ""
    var type : String = ""

    fun showProduct(){
        println("$name$type")
    }
}