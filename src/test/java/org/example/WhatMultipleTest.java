package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;


class WhatMultipleTest {

    @org.junit.jupiter.api.Test
    void whatDoesItReturn() {
        WhatMultiple wm = new WhatMultiple();
        String expected = "FizzBuzz";
        String result = wm.WhatDoesItReturn();

        assertEquals(result, expected);

    }
}