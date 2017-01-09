package anythingandnothing

/**
 * Created by wenchaokong on 9/01/2017.
 * Nothing has no instances. You can use Nothing to represent "a value that never exists": for example,
 * if a function has the return type of Nothing, it means that it never returns (always throws an exception).
 */
class SomeSocket {
    fun handleSocket() : Nothing{
        while(true){
            println("connecting to socket...")
        }
    }

    fun sum (a : IntArray){
        a.sum()
    }
}