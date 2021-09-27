package com.company.SecondFloor;

import com.company.Rooms;

public class NormalRoom extends Rooms {
    private int totalNormalRooms;

    public NormalRoom(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public NormalRoom(){
        setTypeOfRoom("Normal Room");
        setTotalWindows(2);
        setPlaceOfRoom("Second Floor");
        totalNormalRooms = 4;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + ", Total normal Rooms =" + totalNormalRooms +  " }" ;
    }
}
