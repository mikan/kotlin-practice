package com.github.mikan.kotlin.ch07

import java.util.*

/**
 * List 7.1 (P228)
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    /**
     * List 7.7 (P236)
     */
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }

    override fun hashCode(): Int {
        return Objects.hash(x, y)
    }
}
