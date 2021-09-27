package com.company.FirstFloor;

import com.company.Rooms;

public class DiningRoom extends Rooms {
    public DiningRoom(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public DiningRoom() {
        setTypeOfRoom("Dining Room");
        setTotalWindows(4);
        setPlaceOfRoom("First Floor");
    }
}
