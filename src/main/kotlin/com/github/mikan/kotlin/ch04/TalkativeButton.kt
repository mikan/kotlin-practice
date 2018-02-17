package com.github.mikan.kotlin.ch04

//internal open class TalkativeButton : Focusable {
open class TalkativeButton : Focusable {
    //private fun yell() = println("Hey!")
    internal fun yell() = println("Hey!")

    //protected fun whisper() = println("Let's talk!")
    fun whisper() = println("Let's talk!")
}

fun TalkativeButton.giveSpeech() {
    yell()
    whisper()
}

fun main(args: Array<String>) {
    TalkativeButton().giveSpeech()
}
