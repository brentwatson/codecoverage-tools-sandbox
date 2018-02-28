package com.brentwatson.demoapp.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void add() {
        assertEquals(3, new Calc().add(1, 2));
    }

    @Test
    public void div() {
        assertEquals(5.0, new Calc().div(10, 2), 0.0);
    }

}
