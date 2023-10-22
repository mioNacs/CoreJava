package com.internshala.module3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cake cake1 = new Cake("Chocolate Brownie", 250.0f);
        Cake cake2 = new Cake("Chocolate Maple", 300.0f);

        List<Cake> cakeList = new ArrayList();
        cakeList.add(cake1);
        cakeList.add(cake2);

        Cake pastry1 = new Pastry("Black Forest", 35.0f);
        Cake pastry2 = new Pastry("Choco Truffle", 40f);

        List<Cake> pastryList = new ArrayList();
        pastryList.add(pastry1);
        pastryList.add(pastry2);


        System.out.println("        Today's Special Menu            ");
        System.out.println("----------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("----------------------------------------");
        for(Cake cake:cakeList){
            cake.display();
        }
        System.out.println();
        System.out.println("Special Pastries");
        System.out.println("----------------------------------------");
        for(Cake pastry:pastryList){
            pastry.display();
        }

    }
}
