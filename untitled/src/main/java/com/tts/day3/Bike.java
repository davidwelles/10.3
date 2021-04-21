package com.tts.day3;

public class Bike implements Drivable {

    public int speed;
   public int gear;


   //These methods are considered "concrete"
    @Override
    public void changeGear(int a) {
        gear = a;
    }

    @Override
    public void accelerate(int a) {
    speed = speed + a;
    }

    @Override
    public void brake(int a) {
    speed = speed - a;
    }

    public void displayStatus(){
        System.out.println("Speed: " + speed + "gear: " + gear);
    }
}
