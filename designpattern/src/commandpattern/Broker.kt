package commandpattern

import java.util.*

/**
 * Created by wenchaokong on 6/01/2017.
 */
class Broker{
    val orders = ArrayList<Order>()

    fun takeOrder(order : Order){
        orders.add(order)
    }

    fun placeOrders(){
        for (o in orders)o.exectue()
    }
}