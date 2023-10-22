package com.internshala.javaapp.rectangle;

public class dog extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark(){
        System.out.println("wooh! wooh!");
    }
}
