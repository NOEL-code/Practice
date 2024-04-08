package day03;

import java.util.LinkedList;

public class EX06 {
    public static void main(String[] args) {

    }
}

interface Phone {
    int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    int batteryStatus = 70; // 배터리 현재 용량
    boolean isOn = true;

    boolean getIsOn();
    void charge();
    void operateKakaotalk();
    void printBatteryStatus();
    void turnOff();
    void  turnOn();
    void useYoutube();
}

class SamsungPhone implements Phone {
    private final int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true;

    public boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }

        System.out.println(batteryStatus
                + "%가 되었습니다.");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            if (batteryStatus == 0)
                turnOff();
        }
    }

    public void printBatteryStatus() {
        System.out.println(batteryStatus+"%");
    }

    public void turnOff(){
        isOn = false;
    }
    public void  turnOn(){
        isOn = true;
    }
    public void useYoutube(){
        if (isOn) {
            batteryStatus -= 10;

            if (batteryStatus == 0)
                turnOff();
        }
    }
}

class ApplePhone implements Phone{
    private final int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true;

    public boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }

        System.out.println(batteryStatus
                + "%가 되었습니다.");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            if (batteryStatus == 0)
                turnOff();
        }
    }

    public void printBatteryStatus() {
        System.out.println(batteryStatus+"%");
    }

    public void turnOff(){
        isOn = false;
    }
    public void  turnOn(){
        isOn = true;
    }
    public void useYoutube(){
        if (isOn) {
            batteryStatus -= 10;

            if (batteryStatus == 0)
                turnOff();
        }
    }
}

class Person {

    Phone phone; // Now it can hold either ApplePhone or SamsungPhone

    void buyPhone(Phone phone) {
        this.phone = phone;
    }

    void changePhone(Phone phone) {
        this.phone = phone;
    }

    // useKakaotalk()
    void useKakaotalk() {
        if (this.phone.getIsOn())
            this.phone.operateKakaotalk();
    }
    void useYouTube() {
        if (this.phone.getIsOn())
            this.phone.useYoutube();
    }

    void checkBatteryStatus() {
        if (this.phone.getIsOn())
            this.phone.printBatteryStatus();
    }

    void turnOn() {
        if(!this.phone.getIsOn()){
            this.phone.turnOn();
        }
    }
    void charge(){
        this.phone.charge();
    }
    void turnOff(){
        if(this.phone.getIsOn()){
            this.phone.turnOff();
        }
    }
}