package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
interface Criteria{
    fun meetCriteria(persons : List<Person>) : List<Person>
}