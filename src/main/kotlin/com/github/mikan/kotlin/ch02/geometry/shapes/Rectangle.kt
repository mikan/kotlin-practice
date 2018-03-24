package com.github.mikan.kotlin.ch02.geometry.shapes

import java.util.*

/**
 * List 2.8 (P34)
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random();
    return Rectangle(random.nextInt(), random.nextInt())
}
