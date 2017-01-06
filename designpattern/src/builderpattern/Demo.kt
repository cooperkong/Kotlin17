package builderpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
fun main (args : Array<String>){
    val director = Director()

    val product1 = director.getAProduct()

    product1.showProduct()

    val product2 = director.getBProduct()

    product2.showProduct()

}