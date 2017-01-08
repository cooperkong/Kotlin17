package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class CriteriaFemale : Criteria{
    override fun meetCriteria(persons: List<Person>): List<Person> {
        return persons.filter { it.gender.equals("female", true) }
    }
}