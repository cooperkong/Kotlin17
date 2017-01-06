package iteratorpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class TvContainer : Container{

    val movies = arrayListOf("a2", "b2", "c2")
    val tvIterator = TvIterator()
    override fun getIterator(): Iterator {
        return tvIterator
    }

    inner class TvIterator : Iterator {
        var index : Int = 0
        override fun hasNext(): Boolean {
            return index < movies.size
        }

        override fun next(): Any {

            return movies[index++]
        }

    }

}

