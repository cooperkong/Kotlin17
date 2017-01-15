package proxypattern

/**
 * Created by wenchaokong on 15/01/2017.
 *
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 *
优点
1、 代理模式能够协调调用者和被调用者，在一定程度上降低了系统的耦合度。
2、 代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了的作用和保护了目标对象的
缺点
1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
2、 实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 */
fun main (args : Array<String>){
    val image = PorxyImage("test.jpg")
    image.display()
    image.display()
}