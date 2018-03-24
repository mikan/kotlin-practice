package com.github.mikan.kotlin.ch02.smartcast

/**
 * List 2.17 (P41)
 */
interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/**
 * List 2.18 (P42)
 */
fun eval(e: Expr): Int {
    if (e is Num) {
        @Suppress("USELESS_CAST")
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

/**
 * List 2.19 (P44)
 */
fun eval2(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval2(e.right) + eval2(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

/**
 * List 2.20 (P44)
 */
fun eval3(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval3(e.right) + eval3(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}

/**
 * List 2.21 (P45)
 */
fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum(Num(1), Num(2))))
    println(eval3(Sum(Num(1), Num(2))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// Result:
// 7
// 3
// 3
// num: 1
// num: 2
// sum: 1 + 2
// num: 4
// sum: 3 + 4
// 7
