package com.company;

import com.company.FirstFloor.DiningRoom;
import com.company.OutsideHouse.Ground;
import com.company.SecondFloor.BathRoom;
import com.company.SecondFloor.MasterRoom;
import com.company.SecondFloor.NormalRoom;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {




         MasterRoom masterRoom = new MasterRoom();
        masterRoom.StartMenu(masterRoom);

        /* Test sensors in The ground
        Ground ground = new Ground();
        ground.fireSensors();
        ground.animalSensor();
        */



    }
}

