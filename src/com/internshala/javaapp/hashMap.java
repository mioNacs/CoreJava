package com.internshala.javaapp;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap< String, Long> contacts = new HashMap();
        contacts.put("Navneet", 6202672513L);
        contacts.put("papa", 9871844894L);

        System.out.println(contacts.get("papa"));

        for (Map.Entry contact: contacts.entrySet()){
            System.out.println(contact.getKey() + " " +contact.getValue());
        }

    }
}
