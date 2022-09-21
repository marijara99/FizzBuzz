package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class WhatMultipleTest {

    @Test
    public void whatDoesItReturn() {
        WhatMultiple wm = new WhatMultiple();
        String expected = "FizzBuzz";
        String result = wm.WhatDoesItReturn();

        assertEquals(result, expected);

    }
}