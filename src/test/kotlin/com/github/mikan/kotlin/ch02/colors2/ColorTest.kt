package com.github.mikan.kotlin.ch02.colors2

import com.github.mikan.kotlin.ch02.colors.Color
import io.kotlintest.matchers.shouldThrow
import io.kotlintest.specs.FunSpec

class ColorFunTests : FunSpec() {
    init {
        test("mix should throw when dirty results") {
            shouldThrow<Exception> { mix(Color.RED, Color.BLUE) }
            shouldThrow<Exception> { mix(Color.INDIGO, Color.VIOLET) }
            shouldThrow<Exception> { mix(Color.RED, Color.RED) }
        }
        test("mixOptimized should throw when dirty results") {
            shouldThrow<Exception> { mixOptimized(Color.RED, Color.BLUE) }
            shouldThrow<Exception> { mixOptimized(Color.INDIGO, Color.VIOLET) }
            shouldThrow<Exception> { mixOptimized(Color.RED, Color.RED) }
        }
    }
}
