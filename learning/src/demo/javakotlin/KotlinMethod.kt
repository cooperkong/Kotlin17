package demo.javakotlin

/**
 * Created by wenchaokong on 23/01/2017.
 */
class KotlinMethod{

    fun printNumber(a : Int , b : Int = 1, c : Int = 2){
        println("$a,$b,$c")
    }

    @JvmOverloads
    fun printJVMNumber(a : Int , b : Int = 1, c : Int = 2){
        println("$a,$b,$c")
    }
}