package com.github.mikan.kotlin.ch07

/**
 * List 7.2 (P229)
 */
data class Point2(val x: Int, val y: Int)

operator fun Point2.plus(other: Point2): Point2 {
    return Point2(x + other.x, y + other.y)
}
