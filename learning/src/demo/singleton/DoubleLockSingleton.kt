package demo.singleton

/**
 * Created by wenchaokong on 12/01/2017.
 */
class DoubleLockSingleton private constructor(){
    companion object{
        //kotlin way
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
            DoubleLockSingleton()
        }

        //direct translate from java method
        private @Volatile var instance2 : DoubleLockSingleton? = null

        fun getInstancefor2() : DoubleLockSingleton{
            if (instance2 == null){
                synchronized(this){}
                if(instance2 == null)
                    instance2 = DoubleLockSingleton()
                return instance2!!
            }
            return instance2!!
        }

    }
}