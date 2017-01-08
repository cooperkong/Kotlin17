package decoratorpattern

/**
 * Created by wenchaokong on 9/01/2017.
 */
fun main (args : Array<String>){
    val circle = Circle()
    val rectangle = Rectangle()

    val redBorderCircle = RedBorderShape(circle)
    val redBorderRec = RedBorderShape(rectangle)

    circle.draw()
    rectangle.draw()

    redBorderCircle.draw()
    redBorderRec.draw()

}