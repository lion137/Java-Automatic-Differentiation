package com.automaticdifferentiation;


public class Main {
    public static void main(String [] arg){
        System.out.println("Hello Dual numbers");

        DualNumber d1 = new DualNumber(1D, 2D );
        if (d1.getClass() == DualNumber.class)
        System.out.println(d1);

    }
}
