package bridgepattern

/**
 * Created by wenchaokong on 3/01/2017.
 */
class Circle(x:Int, y:Int, radius:Int, drawAPI: DrawAPI) : Shape(drawAPI) {

    val drawAPI: DrawAPI = drawAPI
    val x = x
    val y = y
    val radius = radius

    override fun draw() {
        drawAPI.drawCircle(x, y, radius)
    }

}