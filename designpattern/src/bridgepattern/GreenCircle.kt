package bridgepattern

/**
 * Created by wenchaokong on 3/01/2017.
 */
class GreenCircle() : DrawAPI{
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[ color: green, radius: $radius, x: $x, $y]")
    }

}