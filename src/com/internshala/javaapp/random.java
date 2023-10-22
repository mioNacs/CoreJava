package com.internshala.javaapp;
import java.util.Scanner;
public class random {
    public static void main(String[] args) {
//taking output
        String name;
        int age;
        String Bloodgroup;

        Scanner scanner =new Scanner (System.in);

        System.out.println("Enter your name: ");
        name=scanner.nextLine();

        System.out.println("Enter your age: ");
        age=scanner.nextInt();

        System.out.println("Enter your Blood group: ");
        Bloodgroup =scanner.next();

//For Group's
        String Group ;
        if(age>=20)
        {Group="Red";}

        else if (age>=15)
        {Group="Blue";}

        else if (age>=10)
        {Group="Yellow";}

        else
        {Group="not found";}

//print out of Id card

        System.out.println("----------------------------------------------------");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Blood Group: "+ Bloodgroup);
        System.out.println("------------------------------------------------------");
        System.out.println("Your group is "+ Group);
        System.out.println("-------------------------------------------------------");

    }
}
