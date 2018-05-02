package com.automaticdifferentiation;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void testConstructor() {
       DualNumber d1 = new DualNumber(1D, 2D);
       assertEquals(d1.getClass(), DualNumber.class);
       assertEquals(d1.toString(), "1.0 + 2.0e");
    }

    @Test
    public void testToDual(){
        Double a = 1D;
        DualNumber d1 = DualNumber.toDual(a);
        assertEquals(d1.toString(), "1.0 + 0.0e");
    }

    @Test
    public void testAdd(){
        DualNumber d1 = new DualNumber(1D, 2D);
        DualNumber d2 = DualNumber.toDual(3D);
        assertTrue(new DualNumber(4D, 2D).equals(d1.add(d2)));
    }

}
