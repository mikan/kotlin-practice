package com.github.mikan.kotlin.ch02.exception

import java.io.BufferedReader
import java.io.StringReader

/**
 * List 2.27 (P53)
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

/**
 * List 2.28 (P54)
 */
fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}

/**
 * List 2.29 (P55)
 */
fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader)) // 239
    val reader2 = BufferedReader(StringReader("not a number"))
    readNumber2(reader2) // no output
    val reader3 = BufferedReader(StringReader("not a number"))
    readNumber3(reader3) // null
}

// Result:
// 239
// null
