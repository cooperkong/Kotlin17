package demo.highorderfuntion

/**
 * Created by wenchaokong on 19/01/2017.
 */
fun main(args: Array<String>) {
    val test = InLineFunctions()
    println(test.addSymbol("$",::getPrice))
//    println("$"+ getPrice())

//    println(addSymbol("$",{ getPrice(6)}))
    //In Kotlin, there is a convention that if the last parameter to a function is a function,
    // and you're passing a lambda expression as the corresponding argument,
    // you can specify it outside of parentheses:
//    println(addSymbol("$"){ getPrice(6)})
}

fun getPrice(): String {
    val quantity = 10
    return (45 * quantity).toString()
}



