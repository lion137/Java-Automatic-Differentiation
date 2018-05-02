package com.automaticdifferentiation;


public class Main {
    public static void main(String [] arg){
        System.out.println("Hello Dual numbers");

        DualNumber d1 = new DualNumber(1D, 2D );
        //if (d1.getClass() == DualNumber.class)
        if (d1 instanceof DualNumber)
        System.out.println(d1);
        DualNumber d2 = new DualNumber(1D, 2D);
        DualNumber d3 = DualNumber.toDual(3D);
        DualNumber d4 = new DualNumber(4.0, 2.0);
        System.out.println(d2.add(d3).equals(d4));
        System.out.println(d2.add(d3));


    }
}
