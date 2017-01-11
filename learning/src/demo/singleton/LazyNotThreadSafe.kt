package demo.singleton

/**
 * Created by wenchaokong on 11/01/2017.
 */
class LazyNotThreadSafe{
    companion object {
//        val instance by lazy(LazyThreadSafetyMode.NONE){
//            LazyNotThreadSafe()
//        }

        private var instance2 : LazyNotThreadSafe? = LazyNotThreadSafe()

        fun getInstance()={
            if(instance2 == null)
                instance2 = LazyNotThreadSafe()
            instance2!!
        }
    }
}