package com.github.mikan.kotlin.ch02.callj

import com.github.mikan.kotlin.ch02.convert.Person

/**
 * List 2.7 (P32)
 */
fun main(args: Array<String>) {
    val person = Person("Bob", true) // Before the conversion
    println(person.name)
    println(person.isMarried)
}

// Result:
// Bob
// true
