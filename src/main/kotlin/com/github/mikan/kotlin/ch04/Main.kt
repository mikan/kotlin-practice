package com.github.mikan.kotlin.ch04

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

// Result:
// I'm clickable!
// I'm focusable!
// I got focus.
// I was clicked
