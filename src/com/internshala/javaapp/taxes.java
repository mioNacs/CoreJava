package com.internshala.javaapp;

import java.util.Scanner;

public class taxes {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App ");
        System.out.println("------WELCOME-----");

        Scanner inp = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter total person count: ");
        int count= inp.nextInt();
        System.out.println();

        String[] name = new String[count];
        int[] salary = new int[count];

        for(int i=0; i<count; i++){
            System.out.println("Enter name "+(i+1)+":");
            name[i] = inp.next();
            System.out.println("Enter "+name[i]+"'s Annual Income:");
            salary[i] = inp.nextInt();
            System.out.println();
        }

        System.out.println("Names with liable taxes");
        System.out.println("-----------------------");

        for(int i=0;i<count; i++){
            calculateTax(name[i],salary[i]);
        }
    }
    static void calculateTax(String n , int s){
        int tax;
        if(s>=300000){
            tax=s/5;
        } else if (s>=100000) {
            tax=s/10;
        }
        else{
            tax=0;
        }
        System.out.println(n + " : ₹ "+tax);
    }
}