package com.company.FirstFloor;

import com.company.Rooms;

public class LivingRoom extends Rooms {
    public LivingRoom(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public LivingRoom() {
        setTypeOfRoom("living Room");
        setTotalWindows(3);
        setPlaceOfRoom("First Floor");
    }

}
