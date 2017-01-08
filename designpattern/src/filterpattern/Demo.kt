package filterpattern

import java.util.*

/**
 * Created by wenchaokong on 8/01/2017.
 */
fun main (args : Array<String>){
    val persons = ArrayList<Person>()

    persons.add(Person("Robert", "Male", "Single"))
    persons.add(Person("John", "Male", "Married"))
    persons.add(Person("Laura", "Female", "Married"))
    persons.add(Person("Diana", "Female", "Single"))
    persons.add(Person("Mike", "Male", "Single"))
    persons.add(Person("Bobby", "Male", "Single"))

    val criteriaMale = CriteriaMale()
    val criteriaFemale = CriteriaFemale()
    val criteriaSingle = CriteriaSingle()
    val criteriaAnd = AndCriteria(criteriaMale, criteriaSingle)
    val criteriaOr = OrCriteria(criteriaFemale, criteriaSingle)

    println(criteriaMale.meetCriteria(persons))
    println(criteriaFemale.meetCriteria(persons))
    println(criteriaSingle.meetCriteria(persons))
    println(criteriaAnd.meetCriteria(persons))
    println(criteriaOr.meetCriteria(persons))

}