package templatepattern

/**
 * Created by wenchaokong on 7/01/2017.
 */
abstract class Game{
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    fun play(){
        initialize()
        startPlay()
        endPlay()
    }
}