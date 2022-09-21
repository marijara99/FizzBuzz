package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class WhatMultipleTest  {

    @Test
    public void whatDoesItReturn1() {
        WhatMultiple wm = new WhatMultiple();
        assertEquals("FizzBuzz", wm.WhatDoesItReturn(15));

    }
    @Test
    public void whatDoesItReturn2() {
        WhatMultiple wm = new WhatMultiple();
        assertEquals("16327", wm.WhatDoesItReturn(16327));

    }
    @Test
    public void whatDoesItReturn3() {
        WhatMultiple wm = new WhatMultiple();
        assertEquals("FizzBuzz", wm.WhatDoesItReturn(3525));

    }
    @Test
    public void whatDoesItReturn4() {
        WhatMultiple wm = new WhatMultiple();
        assertEquals("Buzz", wm.WhatDoesItReturn(320));

    }
    @Test
    public void whatDoesItReturn5() {
        WhatMultiple wm = new WhatMultiple();
        assertEquals("Buzz", wm.WhatDoesItReturn(69595));

    }
    @Test
    public void whatDoesItReturn6() {
        WhatMultiple wm = new WhatMultiple();
        assertEquals("Fizz", wm.WhatDoesItReturn(513));

    }


}