package commandpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class BuyOrder(val stock: Stock) : Order{

    override fun exectue() {
        stock.buyStock()
    }

}