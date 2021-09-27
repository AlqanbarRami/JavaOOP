package com.company.SecondFloor;

import com.company.Rooms;

public class SmallToilet extends Rooms {
    public SmallToilet(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public SmallToilet() {
        setTypeOfRoom("Small toilet");
        setTotalWindows(1);
        setPlaceOfRoom("Second Floor");
    }

}
