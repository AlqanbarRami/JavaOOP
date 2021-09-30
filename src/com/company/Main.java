package com.company;

import com.company.FirstFloor.*;
import com.company.SecondFloor.*;
import com.company.UnderHouse.*;
import com.company.OutsideHouse.*;




public class Main {

    public static void main(String[] args) throws InterruptedException {

        MasterRoom masterRoom = new MasterRoom();
        masterRoom.StartMenu(masterRoom);


        /* testing normal room
        NormalRoom normalRoom = new NormalRoom();
        normalRoom.StartMenu(normalRoom);

        */

        /* Test sensors in The ground
        Ground ground = new Ground();
        ground.fireSensors();
        ground.animalSensor();
        */



    }
}

