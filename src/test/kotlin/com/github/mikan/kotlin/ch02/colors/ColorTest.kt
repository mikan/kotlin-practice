package com.github.mikan.kotlin.ch02.colors

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec

class ColorFunTests : FunSpec() {
    init {
        test("rgb(BLUE) should return 255") {
            Color.BLUE.rgb() shouldBe 255
        }
    }
}
