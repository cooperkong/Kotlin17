package commandpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class Stock{
    val quantity = 10
    val name = "sina"

    fun buyStock(){
        println("buy $quantity $name")
    }

    fun sellStock(){
        println("sell $quantity $name")
    }
}