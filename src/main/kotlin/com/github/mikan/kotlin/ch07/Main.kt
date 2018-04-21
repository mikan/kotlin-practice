package com.github.mikan.kotlin.ch07

import java.math.BigDecimal

@Suppress("SENSELESS_COMPARISON", "SimplifyBooleanWithConstants") // ignore IntelliJ suggestion
fun main(args: Array<String>) {
    // List 7.1
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    // Point(x=40, y=60)

    // List 7.2
    val pp1 = Point2(10, 20)
    val pp2 = Point2(30, 40)
    println(pp1 + pp2)
    // Point2(x=40, y=60)

    // List 7.3
    val p = Point(10, 20)
    println(p * 1.5)
    // Point(x=15, y=30)

    // List 7.4
    println('a' * 3)
    // aaa

    // List 7.5
    val pp = Point(10, 20)
    println(-pp)
    // Point(x=-10, y=-20)

    // List 7.6
    var bd = BigDecimal.ZERO
    println(bd++)
    // 0
    println(++bd)
    // 2

    // List 7.7
    println(Point(10, 20) == Point(10, 20))
    // true
    println(Point(10, 20) != Point(5, 5))
    // true
    println(null == Point(1, 2))
    // false

    // List 7.8
    val person1 = Person("Alice", "Smith")
    val person2 = Person("Bob", "Johnson")
    println(person1 < person2)
    // false
    println("abc" < "def")
    // true

    // List 7.9
    val point = Point(10, 20)
    println(point[1])
    // 20

    // List 7.10
    val mp = MutablePoint(10, 20)
    // mp[1] = 42 // !?!?
    println(mp)
}

/**
 * List 7.3 (P230)
 */
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

/**
 * List 7.4 (P230)
 */
operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

/**
 * List 7.5 (P234)
 */
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

/**
 * List 7.6 (P235)
 */
operator fun BigDecimal.inc() = this + BigDecimal.ONE

/**
 * List 7.9 (P239)
 */
operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
