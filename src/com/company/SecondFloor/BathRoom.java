package com.company.SecondFloor;

import com.company.Rooms;

public class BathRoom extends Rooms {
    public BathRoom(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public BathRoom() {
            setTypeOfRoom("Big bathroom");
            setTotalWindows(1);
            setTypeOfWindow("a large panoramic window overlooking the water");
            setPlaceOfRoom("Second Floor");
        }
}
