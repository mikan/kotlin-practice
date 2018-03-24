package com.github.mikan.kotlin.ch02.hello

/**
 * List 2.1 (P22)
 */
fun main(args: Array<String>) {
    println("Hello, world!")
    println(String.format("max(%d, %d) = %d", 1, 2, max(1, 2)))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Result:
// Hello, world!
// max(1, 2) = 2
