package observerpattern

/**
 * Created by wenchaokong on 13/01/2017.
 */
class HexObserver(override var subject: Subject) : Observer(){

    init {
        subject.attach(this)
    }

    override fun update() {
        println(Integer.toHexString(subject.getState()))
    }

}