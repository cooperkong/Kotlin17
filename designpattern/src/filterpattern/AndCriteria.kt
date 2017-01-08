package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class AndCriteria (val criteria : Criteria, val otherCriteria : Criteria): Criteria{
    override fun meetCriteria(persons: List<Person>): List<Person> {
        val ret = criteria.meetCriteria(persons)
        return otherCriteria.meetCriteria(ret)
    }
}