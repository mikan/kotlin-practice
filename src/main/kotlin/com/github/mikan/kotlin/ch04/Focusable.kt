package com.github.mikan.kotlin.ch04

/**
 * List 4.4 (P91)
 */
interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}
