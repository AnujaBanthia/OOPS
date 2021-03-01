package com.concepts.sample;


public class OOPSImpl {
    public static void main(String[] args) {
        Cycle bicycle = new Cycle(2,"road");
        Cycle triCycle = new Cycle(3, "road");

       //System.out.println(bicycle.wheels); //data hiding
        System.out.println("Bicycle has "+bicycle.getNoOfWheels()+" wheels and runs on "+bicycle.getModeOfTransport());
        System.out.println("Tricycle has "+triCycle.getNoOfWheels()+" wheels and runs on "+triCycle.getModeOfTransport());

        MotorBicycle pulsar = new MotorBicycle();
        pulsar.setWheels(2);
        pulsar.setMode("Road");
        pulsar.setEnginePower(100);

        System.out.println("Pulsar has "+pulsar.getNoOfWheels()+" wheels and runs on "+pulsar.getModeOfTransport()+" and has engine with "+pulsar.getEnginePower()+"cc");
    }
}
