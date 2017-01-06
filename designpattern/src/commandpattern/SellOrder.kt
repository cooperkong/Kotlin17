package commandpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class SellOrder(val stock: Stock) : Order{

    override fun exectue() {
        stock.sellStock()
    }

}