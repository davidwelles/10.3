package com.tts.day3;

public interface Drivable {

    //this is my driveable interface for most of my vehicles

    //these methods do not have a body and do not have implementations
    //methods in interfaces do not have implementations
    //these methods are refered to as "abstract"
    void changeGear (int a);
    void accelerate (int a);
    void brake (int a);
}
