package pair

/**
 * Created by wenchaokong on 25/01/2017.
 */
fun main (args : Array<String>){
    val (name , age) = Pair("wenchao1", 18)

    val (width : Int, height : Int) =
            if(name == "wenchao"){
                10 to 10
            }else
                20 to 20
//                Pair(20,20)

    println(width)
    println(height)
}