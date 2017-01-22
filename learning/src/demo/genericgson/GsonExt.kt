package demo.genericgson

import com.google.gson.Gson

/**
 * Created by wenchaokong on 22/01/2017.
 */
inline fun <reified T : Any> Gson.fromJson(json : String) : T{
    return fromJson(json, T::class.java)
}