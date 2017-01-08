package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class CriteriaFemale : Criteria{
    override fun meetCriteria(persons: List<Person>) = persons.filter { it.gender.equals("female", true) }
}