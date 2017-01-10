package demo

/**
 * Created by wenchaokong on 10/01/2017.
 */
enum class Lang(val hello : String){
    ENGLISH("hello"),
    CHINESE("hello"),
    GERMAN("hello"),
    JAPANESE("hello");

    fun sayHello(){
        println(hello)
    }

    companion object{
        fun parse (string : String) : Lang{
            return Lang.valueOf(string.toUpperCase())
        }
    }


}

fun main (args : Array<String>){
    println(Lang.parse(args[0]))
    Lang.parse(args[0]).sayHello()
    Lang.parse(args[0]).sayBye(bye = "hahaha")
}

fun Lang.sayBye(bye : String = "bye"){
    val word = when (this){
        Lang.CHINESE -> "zai jian"
        Lang.ENGLISH -> "zai jian"
        Lang.GERMAN -> "zai jian"
        Lang.JAPANESE -> "zai jian"
        is Lang -> "lol"
        else ->{
            "no name"
        }
    }
    println(word)
}