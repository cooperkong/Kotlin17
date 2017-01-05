package prototypepattern

import java.util.*

/**
 * Created by wenchaokong on 5/01/2017.
 */
class MathHomework : Homework(){
    var date = Date()

    override fun show() {
        println("show math homework" + date.toString())
    }

    fun getMathhomeworkDate(): Date{
        return date
    }

}