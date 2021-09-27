package com.company;

import com.company.Interfaces.FireSensor;
import com.company.Interfaces.QuickButton;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Rooms extends Home implements FireSensor, QuickButton {
    private String typeOfRoom;
    private int totalWindows;
    private String typeOfWindow = "Normal One";
    private String placeOfRoom;

    public Rooms(String typeOfRoom, int totalWindows, String typeOfWindow, String placeOfRoom) {
        this.typeOfRoom = typeOfRoom;
        this.totalWindows = totalWindows;
        this.typeOfWindow = typeOfWindow;
        this.placeOfRoom = placeOfRoom;
    }

    public Rooms(){

    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getTotalWindows() {
        return totalWindows;
    }

    public void setTotalWindows(int totalWindows) {
        this.totalWindows = totalWindows;
    }

    public String getTypeOfWindow() {
        return typeOfWindow;
    }

    public void setTypeOfWindow(String typeOfWindow) {
        this.typeOfWindow = typeOfWindow;
    }

    public String getPlaceOfRoom() {
        return placeOfRoom;
    }

    public void setPlaceOfRoom(String placeOfRoom) {
        this.placeOfRoom = placeOfRoom;
    }


    public void StartMenu(Rooms name) throws InterruptedException {
        boolean closeTheMenu = true;
        while (closeTheMenu) {
            int menu;
            System.out.println("Hello and Welcome, Please choose ONE. ex: 1");
            System.out.println("1- Active Security Alarm");
            System.out.println("2- Active Fire Alarm");
            System.out.println("3- Call police direct");
            System.out.println("4- The normal mode ");
            System.out.println("5- CLose Security --- NEED A PASSWORD! ");
            System.out.println("6- Deactivate Security alarm");
            System.out.println("7- Deactivate Fire alarm");
            System.out.println("8- Quick Action : Close your door, windows and active Security (only if the type of room is master");
            System.out.println("9- Quick Action : Active with your Telephone");
            System.out.println("10 ---------Testing Overloading method : Active with Telephone ---------");

            System.out.println("11- Close The menu ");

            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    name.runSecurity();
                    TimeUnit.SECONDS.sleep(3);
                }
                case 2 -> {
                    name.FireAlarm(true);
                    TimeUnit.SECONDS.sleep(3);
                }
                case 3 -> {
                    name.callPoliceNow();
                    TimeUnit.SECONDS.sleep(3);
                }
                case 4 -> {
                    name.openAllMainDoorsAndWindows();
                    TimeUnit.SECONDS.sleep(5);
                }
                case 5 -> {
                    name.closeSecurity();
                    TimeUnit.SECONDS.sleep(3);
                }
                case 6 -> {
                    name.securityAlarm(false);
                    TimeUnit.SECONDS.sleep(3);
                }
                case 7 -> {
                    name.FireAlarm(false);
                    TimeUnit.SECONDS.sleep(3);
                }

                case 8 -> {
                    name.quickButton(true);
                    TimeUnit.SECONDS.sleep(3);
                }
                case 9 -> {
                    name.activeAlarmWithTelephone();
                    TimeUnit.SECONDS.sleep(3);
                }
                case 10 -> {
                    System.out.println(" What type of Alarm do you want ? Fire or Security. \n Enter 1 or 2 `\n 1-Fire \n 2-Security");
                    Scanner scanner1 = new Scanner(System.in);
                    int answer = scanner1.nextInt();
                    if (answer == 1) {
                        name.activeAlarmWithTelephone(true, false);
                    } else {
                        name.activeAlarmWithTelephone(false, true);
                    }
                    TimeUnit.SECONDS.sleep(3);
                }
                case 11 -> closeTheMenu = false;
                default -> {
                    System.out.println("Please Choose ex: 1, 2 ,3 ");
                    TimeUnit.SECONDS.sleep(4);
                }
            }
        }



    }

    @Override
    public void fireSensors() {
        System.out.println("There seems to be smoke in the house Do you cook? y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.toLowerCase().contains("y")){
            System.out.println("Ok! No Alarm");
        }
        else{
            FireAlarm(true);
            runSprinkler(true);
        }
    }




    @Override
    public String toString() {
        return
                "Type of room ='" + typeOfRoom + '\'' +
                ", Total windows=" + totalWindows +
                ", Type of windows ='" + typeOfWindow + '\'' +
                ", Place of room ='" + placeOfRoom + '\''
                 ;
    }


    @Override
    public void quickButton(boolean activeOrDeactivate) {
        if(activeOrDeactivate) {
            if (getTypeOfRoom().toLowerCase().contains("master")) {
                closeAllMainDoorsAndWindows();
                runSecurity();
            } else {
                System.out.println("This feature is only available inside The master room");
            }
        }
        else{
            quickButton(false);
            securityAlarm(false);
        }
    }
}
