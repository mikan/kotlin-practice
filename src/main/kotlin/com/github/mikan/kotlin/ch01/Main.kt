package com.github.mikan.kotlin.ch01

data class Person(val name: String, val age: Int? = null)

/**
 * List 1-1 (P4)
 */
fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is : $oldest")
}

// Result:
// The oldest is : Person(name=Bob, age=29)
