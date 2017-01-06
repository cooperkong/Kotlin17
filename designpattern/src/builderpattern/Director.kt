package builderpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class Director{

    private val builder = ConcretBuilder()

    fun getAProduct() : Product{
        builder.setpart("Audi", "Q5")
        return builder.getProduct()
    }

    fun getBProduct() : Product{
        builder.setpart("Bmw", "X5")
        return builder.getProduct()
    }
}