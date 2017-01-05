package prototypepattern

/**
 * Created by wenchaokong on 5/01/2017.
 */
abstract class Homework : Cloneable{
    abstract fun show()

    public override fun clone(): Homework {
        val m:Homework = super.clone() as Homework
        return m
    }
}