package decoratorpattern

/**
 * Created by wenchaokong on 9/01/2017.
 * 优点
1、装饰者模式可以提供比继承更多的灵活性
2、可以通过一种动态的方式来扩展一个对象的功能，在运行时选择不同的装饰器，从而实现不同的行为。
3、通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合。可以使用多个具体装饰类来装饰同一对象，得到功能更为强大的对象。
4、具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，在使用时再对其进行组合，原有代码无须改变，符合“开闭原则”。

缺点
1、会产生很多的小对象，增加了系统的复杂性
2、这种比继承更加灵活机动的特性，也同时意味着装饰模式比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为烦琐。
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