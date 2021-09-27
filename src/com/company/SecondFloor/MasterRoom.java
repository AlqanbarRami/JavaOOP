package com.company.SecondFloor;

import com.company.Interfaces.QuickButton;
import com.company.Rooms;

public class MasterRoom extends Rooms implements QuickButton {
    private boolean quickButton = false;  // there is a button but not active, if true close all doors and windows and run security

    public MasterRoom(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        super(typeOfRoom, totalWindows, typeOfWindow, placeOfRoom);
    }

    public MasterRoom() {
        setTypeOfRoom("Master room");
        setTotalWindows(4);
        setPlaceOfRoom("Second Floor");
    }

    public boolean isQuickButton() {
        return quickButton;
    }

    public void setQuickButton(boolean quickButton) {
        this.quickButton = quickButton;
    }

    @Override
    public void quickButton(boolean activeOrDeactivate) {
        setQuickButton(true);
        if(activeOrDeactivate) {
            if (getTypeOfRoom().toLowerCase().contains("master")) {
                closeAllMainDoorsAndWindows();
                runSecurity();
            } else {
                System.out.println("This feature is only available inside The master room");
            }
        }
        else{
            setQuickButton(false);
            securityAlarm(false);
        }
    }

    @Override
    public String toString() {
        return "{ "  + super.toString() +
                ", Quick button Active/Deactivate=" + quickButton +
                " }" ;
    }
}
