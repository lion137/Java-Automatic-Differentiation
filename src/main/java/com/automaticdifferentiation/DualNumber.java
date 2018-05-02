package com.automaticdifferentiation;

public class DualNumber {

    private Double real;
    private Double dual;

    public DualNumber(Double _real, Double _dual) {
        this.real = _real;
        this.dual = _dual;
    }


    @Override public String toString(){
        return real.toString() + " " + (dual < 0 ? "-" : "+") + " " + dual.toString() + "e";
    }

        public static int dual() {
        return 42;
    }
}
