package com.company.UnderHouse;

import com.company.Rooms;
public class Basement extends Rooms {
    public Basement(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public Basement(){
        setTypeOfRoom("Basement");
        setTotalWindows(3);
        setTypeOfWindow("Three small windows");
        setPlaceOfRoom("Under house");
    }


}
