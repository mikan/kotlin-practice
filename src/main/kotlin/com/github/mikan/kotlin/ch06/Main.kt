package com.github.mikan.kotlin.ch06

import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    // 6.21
    println(readNumbers(BufferedReader(StringReader("1\n2\n3"))))
    // [1, 2, 3]

    // 6.22
    addValidNumbers(listOf(1, 2, 3))
    // Sum of valid numbers: 6
    // Invalid numbers: 0

    // 6.23
    addValidNumbers2(listOf(1, 2, 3))
    // Sum of valid numbers: 6
    // Invalid numbers: 0

    // 6.24
    val source = listOf(1, 2, 3)
    val target = mutableListOf<Int>()
    copyElements(source, target)
    println(target)
    // [1, 2, 3]
}

/**
 * List 6.21 (P211)
 */
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

/**
 * List 6.22 (P212)
 */
fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers) {
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: ${sumOfValidNumbers}")
    println("Invalid numbers: ${invalidNumbers}")
}

/**
 * List 6.23 (P213)
 */
fun addValidNumbers2(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

/**
 * List 6.24 (P214)
 */
fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

