package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class OrCriteria(val criteria : Criteria, val otherCriteria : Criteria) : Criteria{
    override fun meetCriteria(persons: List<Person>): List<Person> {
        return criteria.meetCriteria(persons).plus(otherCriteria.meetCriteria(persons)).distinctBy { it.name }
    }

}