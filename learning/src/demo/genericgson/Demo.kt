package demo.genericgson

import com.google.gson.Gson
import java.io.File

/**
 * Created by wenchaokong on 22/01/2017.
 */
fun main (args : Array<String>){
    val json = File(ClassLoader.getSystemResource("songs.json").path).readText()
    val data : Singer = Gson().fromJson(json)
    println(data)

    val data2 : Result<Singer> = ApiFactory.api.getSingerFromApi(json)
    println(data2)
}
