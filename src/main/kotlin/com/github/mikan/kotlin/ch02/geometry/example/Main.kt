package com.github.mikan.kotlin.ch02.geometry.example

import com.github.mikan.kotlin.ch02.geometry.shapes.createRandomRectangle
import java.util.concurrent.atomic.LongAdder
import java.util.stream.IntStream

/**
 * List 2.9 (P34) + mod
 */
fun main(args: Array<String>) {
    // Original
    println(createRandomRectangle().isSquare)

    // Counting
    val trueAdder = LongAdder()
    val falseAdder = LongAdder()
    IntStream.range(0, 100000000).parallel().forEach {
        if (createRandomRectangle().isSquare)
            trueAdder.increment()
        else
            falseAdder.increment()
    }
    println("true: ${trueAdder.sum()} false: ${falseAdder.sum()}")
}

// Result:
// false
// true: 0 false: 100000000
