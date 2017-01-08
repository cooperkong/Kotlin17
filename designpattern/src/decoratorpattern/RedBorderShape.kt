package decoratorpattern

/**
 * Created by wenchaokong on 9/01/2017.
 */
class RedBorderShape(shape : Shape): ShapeDecorator(shape) {

    val shape = shape

    override fun draw() {
        shape.draw()
        setRedBorder(shape)
    }

    private fun setRedBorder(shape : Shape){
        println("set red border")
    }

}