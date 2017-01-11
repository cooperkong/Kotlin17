package demo

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by wenchaokong on 11/01/2017.
 */
interface Service{
    @GET("users/defunkt")
    fun getUsers() : Call<User>


}
data class User(val login : String, val id : Long)

//Singleton is a very useful pattern, and Kotlin (after Scala) makes it easy to declare singletons:
object GitHubService{
    val githubService: Service by lazy {
         Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com")
                .build().create(Service::class.java)
    }
}


fun main (args : Array<String>){
    val github = GitHubService.githubService
    println(github.getUsers().execute().body())

}