package demo.mediaplayer

/**
 * Created by wenchaokong on 16/01/2017.
 */
sealed class PlayerCmd{
    class Play(val url : String, val position : Long = 0) : PlayerCmd()
    class Seek(val position : Long) : PlayerCmd()

    object Pause : PlayerCmd()

    object Resume : PlayerCmd()

    object Stop : PlayerCmd()
}