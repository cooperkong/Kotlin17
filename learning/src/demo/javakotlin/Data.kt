package demo.javakotlin

/**
 * Created by wenchaokong on 23/01/2017.
 */
data class Person (var name : String, var age : Int)
data class JVMPerson (var name : String, @JvmField var age : Int)