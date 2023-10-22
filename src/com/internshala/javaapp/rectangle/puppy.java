package com.internshala.javaapp.rectangle;

public class puppy extends dog{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void cute(){
        System.out.println(this.getName()+" is a cute puppy of breed "+ breed+".");
    }
}
