package com.internshala.module3;

public class Pastry extends Cake {
    public Pastry(String name,float price) {
        super.name = name;
        super.price = price;
    }

    public Pastry() {
    }

    public Pastry(String name) {
        super.name=name;
    }

    public void display(){
        System.out.println(name +" : ₹ " + price + " price per piece");
    }
}
