package demo.singleton

/**
 * Created by wenchaokong on 12/01/2017.
 */
class LazyThreadSafe{
    companion object{
        var instance : LazyThreadSafe? = null

        @Synchronized
        fun getInstance() = {
            if (instance == null)
                instance = LazyThreadSafe()
            instance
        }
    }
}