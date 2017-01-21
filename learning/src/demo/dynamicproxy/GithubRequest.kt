package demo.dynamicproxy

/**
 * Created by wenchaokong on 19/01/2017.
 */
class GithubRequest : HttpRequest{
    override fun request(a : Int) {
        println("send github request")
    }

}