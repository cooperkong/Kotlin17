package demo.singleton

/**
 * Created by wenchaokong on 12/01/2017.
 */
class LazyStaticInnerClass private constructor(){

    companion object{
        fun getInstance() = Holder.instance
    }


    private object Holder{
        var instance = LazyStaticInnerClass()
    }
}