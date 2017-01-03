package bridgepattern

/**
 * Created by wenchaokong on 3/01/2017.
 */
fun main(args : Array<String>){
    val redCircle : Shape = Circle(100, 5,5, RedCircle())
    redCircle.draw()
    val greenCircle : Shape = Circle(100, 5,5, GreenCircle())
    greenCircle.draw()
}