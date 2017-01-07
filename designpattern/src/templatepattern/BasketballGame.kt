package templatepattern

/**
 * Created by wenchaokong on 7/01/2017.
 */
class BasketballGame : Game(){
    override fun initialize() {
        println("init basketball game")
    }

    override fun startPlay() {
        println("start basketball match")
    }

    override fun endPlay() {
        println("end basketball match")
    }

}