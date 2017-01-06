package iteratorpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
fun main (args : Array<String>){
    val itr1 = MovieContainer().movieIterator
    val itr2 = TvContainer().tvIterator

    while(itr1.hasNext())
        println(itr1.next())
    while(itr2.hasNext())
        println(itr2.next())
}