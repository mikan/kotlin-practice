package com.github.mikan.kotlin.ch07

/**
 * List 7.8 (P237)
 */
class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}
