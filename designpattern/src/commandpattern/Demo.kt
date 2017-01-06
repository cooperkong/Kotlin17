package commandpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
fun main (args : Array<String>){

    val stock = Stock()

    val order1 = BuyOrder(stock)
    val order2 = SellOrder(stock)

    val broker = Broker()

    broker.takeOrder(order1)
    broker.takeOrder(order2)
    broker.placeOrders()


}