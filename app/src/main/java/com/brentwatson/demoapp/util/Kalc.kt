package com.brentwatson.demoapp.util

object Kalc {
    fun add(a: Int, b: Int) = a + b

    fun div(a: Int, b: Int): Double {
        return (a / b).toDouble()
    }

}

class Kalc2 {
    fun sub(a: Int, b: Int) = a - b
}

fun Int.mult(b: Int) = this * b
