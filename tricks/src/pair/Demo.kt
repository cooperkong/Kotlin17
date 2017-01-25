package pair

/**
 * Created by wenchaokong on 25/01/2017.
 */
fun main (args : Array<String>){
    val (name : String, age : Int) = Pair("wenchao1", 18)

    val (width : Int, height : Int) =
            if(name == "wenchao"){
                Pair(10, 10)
            }else
                Pair(20,20)

    println(width)
    println(height)
}