package semanticvalidation

/**
 * Created by wenchaokong on 9/01/2017.
 *
 * public void join(String seperator, List<String> strings){
 * if(seperator == null) throw new NullpointerException();
 * if(seperator.length < 2) throw new IllegalArgumentException();
 * if(strings == null) throw new NullpointerException();
 *
 * }
 *
 *
 */
class SomeClass {
    fun join(seperators : String, strings : List<String>){
        require(seperators.length > 2){ println("seperator must be > 2") }
    }
}