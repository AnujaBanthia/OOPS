package com.concepts.sample;

public class MotorBicycle extends MotorVehicle{ // abstraction

    private int wheels; //data hiding
    private String mode;
    private int enginePower;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public int getNoOfWheels() {
        return this.wheels;
    }

    @Override
    public String getModeOfTransport() {
        return this.mode;
    }

    @Override
    public int getEnginePower() {
        return this.enginePower;
    }
}
