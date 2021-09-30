package com.company.UnderHouse;

import com.company.Rooms;

public class Garage extends Rooms {

    public Garage(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public Garage() {
        this.setTypeOfRoom("Garage");
        this.setTotalWindows(1);
        this.setTypeOfWindow("Small");
        this.setPlaceOfRoom("Under House");

    }
}
