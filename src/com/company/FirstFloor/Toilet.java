package com.company.FirstFloor;

import com.company.Rooms;

public class Toilet extends Rooms {
    public Toilet(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public Toilet() {
        setTypeOfRoom("Toilet");
        setTotalWindows(1);
        setPlaceOfRoom("First Floor");
    }


}
