package demo.singleton

/**
 * Created by wenchaokong on 12/01/2017.
 */
fun main (args : Array<String>){
    var test  = LazyNotThreadSafe.instance
    var test2 = LazyNotThreadSafe.getInstance() //return second instances
    var plainold = SampleClass
}