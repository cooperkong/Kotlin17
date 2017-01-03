package bridgepattern

/**
 * Created by wenchaokong on 3/01/2017.
 * http://blog.csdn.net/xingjiarong/article/details/50132727
 * 桥接模式的优点:

1、分离抽象接口及其实现部分。
2、桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
3、实现细节对客户透明，可以对用户隐藏实现细节。

桥接模式的缺点:

1、桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进
2、桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性
 */
fun main(args : Array<String>){
    val redCircle : Shape = Circle(100, 5,5, RedCircle())
    redCircle.draw()
    val greenCircle : Shape = Circle(100, 5,5, GreenCircle())
    greenCircle.draw()
}