package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class AndCriteria (val criteria : Criteria, val otherCriteria : Criteria): Criteria{
    override fun meetCriteria(persons: List<Person>) = otherCriteria.meetCriteria(criteria.meetCriteria(persons))
}