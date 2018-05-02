package com.automaticdifferentiation;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void test() {
        int a  = DualNumber.dual();
        assertEquals(a, 42) ;
    }

}
