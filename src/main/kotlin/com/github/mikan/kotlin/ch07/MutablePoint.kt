package com.github.mikan.kotlin.ch07

/**
 * List 7.10 (P240)
 */
data class MutablePoint(var x: Int, var y: Int) {
    operator fun MutablePoint.set(index: Int, value: Int) {
        when (index) {
            0 -> x = value
            1 -> y = value
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }
}
