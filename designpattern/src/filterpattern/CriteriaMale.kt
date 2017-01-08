package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class CriteriaMale : Criteria{

    override fun meetCriteria(persons: List<Person>) = persons.filter { it.gender.equals("male", true) }

}