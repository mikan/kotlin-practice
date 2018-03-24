package com.github.mikan.kotlin.ch02.iterate

import java.util.*

/**
 * List 2.24 (P49) + mod
 */
fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    // P50
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

// Result:
// A = 1000001
// B = 1000010
// C = 1000011
// D = 1000100
// E = 1000101
// F = 1000110
// 0: 10
// 1: 11
// 2: 1001
