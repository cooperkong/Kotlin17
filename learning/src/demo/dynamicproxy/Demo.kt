package demo.dynamicproxy

/**
 * Created by wenchaokong on 19/01/2017.
 */
fun main (args : Array<String>){
    val request :HttpRequest = HttpRequestProxy().bind(GithubRequest()) as HttpRequest
    request.request(1)
}