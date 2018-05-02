package com.automaticdifferentiation;

import org.omg.CORBA.Object;

public class DualNumber {

    private Double real;
    private Double dual;

    public DualNumber(Double _real, Double _dual) {
        this.real = _real;
        this.dual = _dual;
    }

    public Double getReal() {
        return real;
    }

    public Double getDual() {
        return dual;
    }

    public DualNumber add(DualNumber other){
        return new DualNumber(this.real + other.real, this.dual + other.dual);
    }

    public DualNumber sub(DualNumber other){
        return new DualNumber(this.real - other.real, this.dual - other.dual);
    }

    public DualNumber mul(DualNumber other){
        return new DualNumber(this.real * other.real, this.real * other.dual + this.dual * other.real);
    }

    @Override
    public String toString() {
        return real.toString() + " " + (dual < 0 ? "-" : "+") + " " + Math.abs(dual) + "e";
    }

    @Override
    public boolean equals(java.lang.Object thatObject){
        if (!(thatObject instanceof DualNumber)) return false;
        DualNumber thatDual = (DualNumber) thatObject;
        return (this.real.equals(thatDual.real)) && (this.dual.equals(thatDual.dual));
    }

    protected static DualNumber toDual(Double a){
        return new DualNumber(a, 0D);
    }
}
