package demo.genericgson

/**
 * Created by wenchaokong on 22/01/2017.
 */
data class Song (val id : Int, val name : String)
data class Singer (val code : Int, val message : String, val content : List<Song>)
data class Result<out Content> (val code : Int, val message : String, val content : List<Content>)
