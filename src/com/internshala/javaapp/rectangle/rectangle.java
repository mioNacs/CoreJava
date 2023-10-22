package com.internshala.javaapp.rectangle;

public class rectangle {

    private int length;
    private int breadth;

    public rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public rectangle(int length, int breadth){
        System.out.println("parameterised constructor triggered.");
        this.length = length;
        this.breadth=breadth;
    }

    public void perimeter(){
        System.out.println("Perimeter of rectangle is " +(2*(length+breadth)) );
    }

    public void area(){
        System.out.println("Area of rectangle is " + length*breadth );
    }
}
