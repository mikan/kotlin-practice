package com.github.mikan.kotlin.ch02.colors2

import com.github.mikan.kotlin.ch02.colors.Color
import com.github.mikan.kotlin.ch02.colors.Color.*

/**
 * List 2.14 (P38)
 */
fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

/**
 * List 2.15 (P39)
 */
fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty color")
}

/**
 * List 2.16 (P40)
 */
fun mixOptimized(c1: Color, c2: Color) = when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
    (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
    (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
    else -> throw Exception("Dirty Color")
}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
    println(mix(BLUE, YELLOW))
    println(mixOptimized(BLUE, YELLOW))
}

// Output:
// warm
// GREEN
// GREEN
