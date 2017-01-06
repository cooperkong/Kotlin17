package builderpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class ConcretBuilder : Builder() {

    private var product = Product()

    override fun setpart(name1: String, name2: String) {
        product.name = name1
        product.type = name2
    }

    override fun getProduct(): Product {
        return product
    }

}