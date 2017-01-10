package demo

import rx.Observable
import java.io.File

/**
 * Created by wenchaokong on 11/01/2017.
 */
fun main (args : Array<String>){
    val file = File(ClassLoader.getSystemResource("file").path).readText()
    Observable.from(file.toCharArray().asIterable())
            .filter { !it.isWhitespace() }
            .groupBy { it }
            .map { operatorGroupBy -> operatorGroupBy.count()
                    .subscribe {
                        println("${operatorGroupBy.key} $it")
                    }
            }
            .subscribe()

}