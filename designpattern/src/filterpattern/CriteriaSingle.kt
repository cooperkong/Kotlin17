package filterpattern

/**
 * Created by wenchaokong on 8/01/2017.
 */
class CriteriaSingle : Criteria{
    override fun meetCriteria(persons: List<Person>) = persons.filter { it.marritalStatus.equals("single", true) }
}