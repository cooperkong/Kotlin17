package anythingandnothing

/**
 * Created by wenchaokong on 9/01/2017.
 */
fun main (args : Array<String>){
    val socket = SomeSocket()

    socket.handleSocket()
    println("connected!")
}