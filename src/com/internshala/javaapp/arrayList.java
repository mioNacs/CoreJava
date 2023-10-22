package com.internshala.javaapp;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> values  = new ArrayList();

        values.add(342);
        values.add(3424);
        values.add(65754635);
        values.add(4657632);

        for ( Integer value:values){
            System.out.println(value);
        }
    }

}
