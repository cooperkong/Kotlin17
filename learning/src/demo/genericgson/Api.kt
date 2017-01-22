package demo.genericgson

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

/**
 * Created by wenchaokong on 22/01/2017.
 */
interface Api{
    fun getSingerFromApi(json : String) : Result<Singer>
}

object ApiFactory{
    val api : Api by lazy {
        Proxy.newProxyInstance(ApiFactory.javaClass.classLoader, arrayOf(Api::class.java),
                InvocationHandler { any, method, arrayOfAnys ->
                    val genericType = method.genericReturnType
                    val adapter = Gson().getAdapter(TypeToken.get(genericType))
                    adapter.fromJson(arrayOfAnys[0].toString())

                }) as Api
    }
}