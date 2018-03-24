package com.github.mikan.kotlin.ch02.template

/**
 * List 2.2 (P28)
 */
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}

// Result:
// Hello, Kotlin!
