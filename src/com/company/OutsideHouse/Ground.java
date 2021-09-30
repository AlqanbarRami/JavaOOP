package com.company.OutsideHouse;

import com.company.Home;
import com.company.Interfaces.AnimalSensor;
import com.company.Interfaces.FireSensor;

import java.util.Random;
import java.util.Scanner;

//it's not type of rooms, but  still connected with Home security
public class Ground extends Home implements AnimalSensor, FireSensor {


    public Ground(){

    }

    public void activeAlarmWithTelephone() {
        System.out.println("There is no telephone here");
    }
    public void activeAlarmWithTelephone(boolean activeFireAlarm, boolean activeSecurityAlarm){
        System.out.println("There is no telephone here");
    }


    @Override
    public void fireSensors() {
        System.out.println("Fire in the ground ");
        FireAlarm(true);
    }

    @Override
    public void animalSensor() {
        System.out.println("Are you human?");
        int x = new Random().nextInt(10);
        int y = new Random().nextInt(10);
        System.out.println("Can you solve it? " +  x  + " + " +  y  + " ?");
        int z = x + y;
        int answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
        if(answer != z ){
            System.out.println("You are not human");
            System.out.println("I will not take any action");
        }
        else {
            securityAlarm(true);
        }
    }
}
