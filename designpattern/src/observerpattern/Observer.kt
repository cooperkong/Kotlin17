package observerpattern

/**
 * Created by wenchaokong on 13/01/2017.
 */
abstract class Observer{
    protected open var subject = Subject()
    abstract fun update()
}