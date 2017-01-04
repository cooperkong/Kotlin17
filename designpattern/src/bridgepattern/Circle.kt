package bridgepattern

/**
 * Created by wenchaokong on 3/01/2017.
 */
class Circle(val x:Int, val y:Int, val radius:Int, val drawAPI: DrawAPI) : Shape(drawAPI) {

    override fun draw() {
        drawAPI.drawCircle(x, y, radius)
    }

}