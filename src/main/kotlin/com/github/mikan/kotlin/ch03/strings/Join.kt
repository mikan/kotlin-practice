package com.github.mikan.kotlin.ch03.strings

/**
 * List 3.1 (P60), 3.2 (P63) and 3.3 (P65)
 */
fun <T> joinToString(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        suffix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))
    println(joinToString(list))
    println(joinToString(list, suffix = ";", prefix = "# "))
}

// Result:
// (1; 2; 3)
// 1, 2, 3
// # 1, 2, 3;
