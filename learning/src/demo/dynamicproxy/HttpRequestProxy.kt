package demo.dynamicproxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * Created by wenchaokong on 19/01/2017.
 */
class HttpRequestProxy : InvocationHandler{

    var obj : Any? = null

    fun bind(input : Any) : Any{
        obj = input
        return Proxy.newProxyInstance(input.javaClass.classLoader, input.javaClass.interfaces, this)
    }

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        println("before httprequest--->" + args)
        val ret = method!!.invoke(obj, *(args ?: arrayOfNulls<Any>(0)))
        println("after httprequest--->")
        return ret
    }

}