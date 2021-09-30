package com.company;



import com.company.Interfaces.AnimalSensor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Home extends SecuritySystem implements AnimalSensor {
    private boolean telephoneWithAlarm;
    private boolean sprinkler;

    // I don't need constructor with variables in this class , so I didn't create it
    public Home() {

    }

    public boolean isSprinkler() {
        return sprinkler;
    }

    public void setSprinkler(boolean sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void runSprinkler(boolean sprinklerRun) {
        if (sprinklerRun) {
            System.out.println("sprinkler system is running");
        } else {
            setSprinkler(false);
        }
    }

    public boolean isTelephoneWithAlarm() {
        return telephoneWithAlarm;
    }

    public void setTelephoneWithAlarm(boolean telephoneWithAlarm) {
        this.telephoneWithAlarm = telephoneWithAlarm;
    }

    public void activeAlarmWithTelephone() {
        setTelephoneWithAlarm(true);
        closeAllMainDoorsAndWindows();
        securityAlarm(true);
        callPoliceNow();
    }

    public void activeAlarmWithTelephone(boolean activeFireAlarm, boolean activeSecurityAlarm) {
        if (activeFireAlarm && activeSecurityAlarm == false) {
            FireAlarm(true);
        } else if (activeFireAlarm == false && activeSecurityAlarm) {
            securityAlarm(true);

        }
    }

    public void callPoliceNow() {
        setCallPolice(true);
        securityAlarm(true);
        closeAllMainDoorsAndWindows();
        System.out.println("The police on the way");
    }


    @Override
    public void runSecurity() {
        setWindowOpenClose(true);
        setMainFrontDoor(true);
        setRunSecurity(true);
        System.out.println("The security is activated, all doors and windows closed");
    }


    @Override
    public void closeAllMainDoorsAndWindows() {
        setWindowOpenClose(true);
        setMainFrontDoor(true);
    }

    @Override
    public void openAllMainDoorsAndWindows() {
        setMainFrontDoor(false);
        setWindowOpenClose(false);
        System.out.println("The normal mode is running now, All doors are now open. The safety system is still working.");
    }

    @Override
    public void closeSecurity() {
        int i = 4;
        String edugrade = "edugrade";
        String passWord;
        System.out.println("Please Enter the Password");
        Scanner scanner = new Scanner(System.in);
        passWord = scanner.nextLine();
        while (!passWord.equals(edugrade)) {
            System.out.println("WRONG!!");
            System.out.println("Did you forget your password? y/n");
            Scanner scanner1 = new Scanner(System.in);
            String forgetPass = scanner1.nextLine();
            if (forgetPass.contains("y")) {
                System.out.println("What is the first name of our Teacher? ");
                Scanner scanner4 = new Scanner(System.in);
                String teacherName = scanner4.nextLine();
                if (teacherName.toLowerCase().equals("tomas")) {
                    System.out.println("Your Password is : " + edugrade);
                    System.out.println("Enter the Password Now ..");
                    passWord = scanner.nextLine();
                } else {
                    System.out.println("Your Answer is Wrong");
                    System.out.println("You have " + i + " left. I will call the police after that");
                    System.out.println("Please Enter the Password");
                    Scanner scanner2 = new Scanner(System.in);
                    passWord = scanner2.nextLine();
                    i = i - 1;

                }
            } else {
                System.out.println("You have " + i + " left. I will call the police after that");
                System.out.println("Please Enter the Password");
                Scanner scanner2 = new Scanner(System.in);
                passWord = scanner2.nextLine();
                if (i == 1) {
                    closeAllMainDoorsAndWindows();
                    securityAlarm(true);
                    callPoliceNow();
                    break;
                }
                i = i - 1;

            }

        }
        openAllMainDoorsAndWindows();
        setRunSecurity(false);
        System.out.println("The Security System is closed now, Doors and windows are open");
    }

    @Override
    public void FireAlarm(boolean activefireAlarm) {
        boolean keepAsk = true;
        if (activefireAlarm) {
            System.out.println("FIRE Alarm activated");
            System.out.println("Do you want to call the firefighter guys ?");
            while (keepAsk = true) {
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                if (answer.toLowerCase().contains("y")) {
                    System.out.println("Firefighter on the way");
                    keepAsk = false;
                    break;
                } else if (answer.toLowerCase().contains("n")) {
                    System.out.println("We didn't call them, FireAlarm is close now");
                    FireAlarm(false);
                    keepAsk = false;
                    break;
                } else {
                    System.out.println("please enter n or y");

                }

            }
        } else {
            System.out.println("The FIRE alarm is deactivated");
        }

    }

    @Override
    public void securityAlarm(boolean activeSecurityAlarm) {
        if (activeSecurityAlarm) {
            closeAllMainDoorsAndWindows();
            System.out.println("SECURITY alarm activated, all windows and doors are close now");
        } else {
            System.out.println("SECURITY alarm closed, all windows and doors are open now.");
            openAllMainDoorsAndWindows();
        }

    }

    public void StartMenu(Home name) throws InterruptedException {
        boolean closeTheMenu = true;
        while (closeTheMenu) {
            int menu;
            System.out.println("Hello and Welcome, Please choose ONE. ex: 1");
            System.out.println("1- Active Security Alarm");
            System.out.println("2- Active Fire Alarm");
            System.out.println("3- Call police direct");
            System.out.println("4- The normal mode ");
            System.out.println("5- Deactivate Security alarm");
            System.out.println("6- Deactivate Fire alarm");
            System.out.println("7- Quick Action : Active with your Telephone");
            System.out.println("8---------Testing Overloading method : Active with Telephone ---------");
            System.out.println("9- Close The menu ");

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
                    name.securityAlarm(false);
                    TimeUnit.SECONDS.sleep(3);
                }
                case 6 -> {
                    name.FireAlarm(false);
                    TimeUnit.SECONDS.sleep(3);
                }
                case 7 -> {
                    name.activeAlarmWithTelephone();
                    TimeUnit.SECONDS.sleep(3);
                }
                case 8 -> {
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
                case 9 -> closeTheMenu = false;
                default -> {
                    System.out.println("Please Choose ex: 1, 2 ,3 ");
                    TimeUnit.SECONDS.sleep(4);
                }
            }
        }


    }


    @Override
    public void animalSensor() {
        System.out.println("We found animal");
    }
}