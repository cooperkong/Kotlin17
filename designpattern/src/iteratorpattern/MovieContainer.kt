package iteratorpattern

/**
 * Created by wenchaokong on 6/01/2017.
 */
class MovieContainer : Container{

    val movies = arrayOf("a", "b", "c")
    val movieIterator = MovieIterator()
    override fun getIterator(): Iterator {
        return movieIterator
    }

    inner class MovieIterator : Iterator {
        var index : Int = 0
        override fun hasNext(): Boolean {
            return index < movies.size
        }

        override fun next(): Any {
            return movies[index++]
        }

    }

}

