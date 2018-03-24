package com.github.mikan.kotlin.ch04

/**
 * List 4.2 (P90) and 4.5 (P92)
 */
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}
