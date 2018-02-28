package com.brentwatson.demoapp.util

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by brentwatson on 2/28/18.
 */
class KalcTest {

    @Test
    fun add() {
        assertEquals(3, Kalc.add(1, 2).toLong())
    }

    @Test
    fun sub() {
        assertEquals(1, Kalc2().sub(4, 3).toLong())
    }

    @Test
    fun div() {
        assertEquals(5.0, Kalc.div(10, 2), 0.0)
    }

    @Test
    fun mult() {
        assertEquals(12, 6.mult(2))
    }

}
