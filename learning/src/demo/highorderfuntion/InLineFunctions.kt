package demo.highorderfuntion

/**
 * Created by wenchaokong on 19/01/2017.
 */
class InLineFunctions {
    //fun getPrice(quantity : Int) : String = (6 * quantity).toString()

//    companion object {

         fun addSymbol(sym: String, input: () -> String): String {
            return sym + input()
        }
//    }
}