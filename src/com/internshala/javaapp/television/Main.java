package com.internshala.javaapp.television;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Television();

        remote.powerOn();
        remote.volumeUp();
        remote.volumeDown();
        remote.powerOff();
    }

}
