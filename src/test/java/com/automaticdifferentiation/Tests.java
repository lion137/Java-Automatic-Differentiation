package com.automaticdifferentiation;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testConstructor() {
       DualNumber d1 = new DualNumber(1D, 2D);
       assertEquals(d1.getClass(), DualNumber.class);
       assertEquals(d1.toString(), "1.0 + 2.0e");
    }

}
