package com.tts.day3;

import com.tts.day3.abs.Guitar;
import com.tts.day3.abs.Instrument;
import com.tts.day3.abs.Trumpet;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        System.out.println(myVehicle.wheels);

        Guitar myGuitar = new Guitar();
        Trumpet myTrumpet = new Trumpet();

      myGuitar.createSound();
      myTrumpet.createSound();
;    }
}
