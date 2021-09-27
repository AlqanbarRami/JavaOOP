package com.company.OutsideHouse;

import com.company.Home;
import com.company.Interfaces.FireSensor;

import java.util.Random;
import java.util.Scanner;

//it's not type of rooms, but it's still connected with Home security
public class DoubleGarage extends Home implements FireSensor {
        private int gates;
        private String door;

    public DoubleGarage(int gates, String door) {
        this.gates = gates;
        this.door = door;
    }
    public DoubleGarage(){
        setGates(2);
        setDoor("One slide door");

    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }

    @Override
        public void fireSensors() {
            System.out.println("Fire in the double garage ");
            FireAlarm(true);
        }



    @Override
    public String toString() {
        return "DoubleGarage{" +
                "gates=" + gates +
                ", door='" + door + '\'' +
                "} " + super.toString();
    }
}
