package com.internshala.javaapp.television;

public class Television implements Remote {

    @Override
    public void volumeUp() {
        System.out.println("Volume UP!");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down!");
    }

    @Override
    public void powerOn() {
        System.out.println("Power On!");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off!");
    }
}
