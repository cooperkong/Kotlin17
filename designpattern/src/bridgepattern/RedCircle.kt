package bridgepattern

/**
 * Created by wenchaokong on 3/01/2017.
 */
class RedCircle() : DrawAPI{
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[ color: red, radius: $radius, x: $x, $y]")
    }
}