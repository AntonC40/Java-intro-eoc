package com.car;

public class Honda extends Car {
    boolean isTurboCharged;

    public Honda (String color, int year, int maxSpeed, boolean isTurboCharged){
        super(color, year, maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }
    public boolean getIsTurboCharged(){
        return isTurboCharged;
    }
    public void setIsTurboCharged(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
    }
}