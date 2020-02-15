package com.github.mikan.kotlin.ch03.stringsext

/**
 * List 3.4 (P71)
 */
fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        suffix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        suffix: String = ""
) = joinToString(separator, prefix, suffix)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(separator = "; ", prefix = "(", suffix = ")"))
    println(listOf("one", "two", "eight").join(" "))
    // listOf(1, 2, 8).join() // N/A
}

// Output:
// (1; 2; 3)
// one two eight
