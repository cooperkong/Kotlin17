package explosiveplaceholders

/**
 * Created by wenchaokong on 9/01/2017.
 */
class SomeTasks : Runnable{
    override fun run() {
        if(true){
            println("do somthing")
        }else{
            //in java it will be //TODO
            TODO("do something else")
        }
    }

}
