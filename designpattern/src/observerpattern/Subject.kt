package observerpattern

import java.util.*

/**
 * Created by wenchaokong on 13/01/2017.
 */
class Subject{
    val observers = ArrayList<Observer>()
    var state : Int? = null

    fun setState(newState : Int){
        state = newState
        notifyObservers()
    }

    fun getState() : Int = state!!

    fun attach (observer: Observer)  = observers.add(observer)

    private fun notifyObservers(){
        for (o in observers)
            o.update()
    }
}