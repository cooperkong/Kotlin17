package demo

fun main (args : Array<out String>){
    println (" hello world")
    println(Man(1, "wenchao"))

    //reflection print out constructor
    Man::class.constructors.map(::println)
}

data class Man(val id : Int , val name : String)