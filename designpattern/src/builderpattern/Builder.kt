package builderpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
abstract class Builder{
    abstract fun setpart(name1:String, name2:String)
    abstract fun getProduct() : Product
}