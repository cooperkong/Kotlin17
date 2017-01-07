package templatepattern

/**
 * Created by wenchaokong on 7/01/2017.
 */
class FootballGame : Game(){
    override fun initialize() {
        println("init football game")
    }

    override fun startPlay() {
        println("start football match")
    }

    override fun endPlay() {
        println("end football match")
    }

}