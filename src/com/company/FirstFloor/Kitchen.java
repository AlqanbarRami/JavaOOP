package com.company.FirstFloor;

import com.company.Rooms;

public class Kitchen extends Rooms {
    public Kitchen(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public Kitchen() {
        setTypeOfRoom("Kitchen");
        setTotalWindows(3);
        setPlaceOfRoom("First Floor");
    }
}
