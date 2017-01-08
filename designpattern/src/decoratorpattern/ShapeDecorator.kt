package decoratorpattern

/**
 * Created by wenchaokong on 9/01/2017.
 */
abstract class ShapeDecorator(shape : Shape) : Shape{
    abstract override fun draw()
}