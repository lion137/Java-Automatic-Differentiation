package com.automaticdifferentiation;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void testConstructor() {
       DualNumber d1 = new DualNumber(1D, 2D);
       DualNumber d2 = new DualNumber(1D, -2D);
       DualNumber d3 = new DualNumber(1D, 0D);
       assertEquals(d1.getClass(), DualNumber.class);
       assertEquals(d1.toString(), "1.0 + 2.0e");
       assertEquals(d2.toString(), "1.0 - 2.0e");
       assertEquals(d3.toString(), "1.0 + 0.0e");
    }

    @Test
    public void testToDual(){
        Double a = 1D;
        Double b = -1D;
        DualNumber d1 = DualNumber.toDual(a);
        DualNumber d2 = DualNumber.toDual(b);
        assertEquals(d1.toString(), "1.0 + 0.0e");
        assertEquals(d2.toString(), "-1.0 + 0.0e");
    }

    @Test
    public void testAdd(){
        DualNumber d1 = new DualNumber(1D, 2D);
        DualNumber d2 = DualNumber.toDual(3D);
        DualNumber d3 = new DualNumber(1D, -2D);
        assertTrue(new DualNumber(4D, 2D).equals(d1.add(d2)));
        assertTrue(new DualNumber(2D, 0D).equals(d1.add(d3)));
    }

    @Test
    public void testSub(){
        DualNumber d1 = new DualNumber(1D, 2D);
        DualNumber d2 = new DualNumber(1D, -2D);
        assertTrue (d1.sub(d2).equals(new DualNumber(0D, 4D)));
        assertTrue (d1.sub(d1).equals(new DualNumber(0D, 0D)));
    }

    @Test
    public void testMul(){
        DualNumber d1 = new DualNumber(1D, 2D);
        DualNumber d2 = new DualNumber(1D, -2D);
        DualNumber d3 = new DualNumber(-1D, 2D);
        assertTrue(d1.mul(d2).equals(new DualNumber(1D, 0D)));
        assertTrue(d1.mul(d3).equals(new DualNumber(-1D, 0D)));
    }

}
