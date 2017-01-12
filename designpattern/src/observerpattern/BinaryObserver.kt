package observerpattern

/**
 * Created by wenchaokong on 13/01/2017.
 */
class BinaryObserver(override var subject: Subject) : Observer(){

    init {
        subject.attach(this)
    }

    override fun update() {
        println(Integer.toBinaryString(subject.getState()))
    }

}