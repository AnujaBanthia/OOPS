package com.concepts.sample;

public class Cycle implements Vehicle{ //abstraction ,  encapsulation

    private int wheels; //data hiding
    private String mode;


    Cycle(int wheels, String mode){
        this.wheels = wheels;
        this.mode = mode;
    }

    @Override
    public int getNoOfWheels() {
        return wheels;
    }

    @Override
    public String getModeOfTransport() {
        return mode;
    }
}

