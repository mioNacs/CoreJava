package com.internshala.module3;

public class Cake {
    public String name;
    public float price;

    public Cake(String name) {

        this.name = name;
    }

    public Cake(){
    }

    public Cake(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println(name +" : ₹ " + price+ " price per pound");
    }
}
