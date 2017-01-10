package demo

/**
 * a_b_c_d_e_f_g_h_j
 * Created by wenchaokong on 10/01/2017.
 */
fun main (vararg args : String){
    args.flatMap{
        it.split("_")
    }.map {
        print("$it ${it.length}")
    }
}