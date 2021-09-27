package com.company;

import java.util.Scanner;

public abstract class SecuritySystem {
    private boolean runSecurity = true;  // SECURITY SYSTEM IS ALWAYS ACTIVE AT FIRST

    // audio signals
    private boolean runSecurityAlarm;
    private boolean runFireAlarm;
    private boolean windowOpenClose;
    private boolean callPolice;
    private boolean mainFrontDoor;


    public boolean isRunSecurity() {
        return runSecurity;
    }

    public void setRunSecurity(boolean runSecurity) {
        this.runSecurity = runSecurity;
    }

    public boolean isRunSecurityAlarm() {
        return runSecurityAlarm;
    }

    public void setRunSecurityAlarm(boolean runSecurityAlarm) {
        this.runSecurityAlarm = runSecurityAlarm;
    }

    public boolean isRunFireAlarm() {
        return runFireAlarm;
    }

    public void setRunFireAlarm(boolean runFireAlarm) {
        this.runFireAlarm = runFireAlarm;
    }

    public boolean isWindowOpenClose() {
        return windowOpenClose;
    }

    public void setWindowOpenClose(boolean windowOpenClose) {
        this.windowOpenClose = windowOpenClose;
    }

    public boolean isCallPolice() {
        return callPolice;
    }

    public void setCallPolice(boolean callPolice) {
        this.callPolice = callPolice;
    }

    public boolean isMainFrontDoor() {
        return mainFrontDoor;
    }

    public void setMainFrontDoor(boolean mainFrontDoor) {
        this.mainFrontDoor = mainFrontDoor;
    }

    public abstract void runSecurity();
    public abstract void closeAllMainDoorsAndWindows();
    public abstract void openAllMainDoorsAndWindows();
    public abstract void closeSecurity();

    //There are two different types of audio signals. One for the fires and the other for thefts
    public abstract void FireAlarm(boolean activefireAlarm);
    public abstract void securityAlarm(boolean activeSecurityAlarm);



}
