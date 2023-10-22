package com.internshala.javaapp.rectangle;

public class cat extends Animal{
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void meow(){
        System.out.println("Meow! meoooooow!");
    }
    public void run(){
        super.run();                    //calling run from animal
        System.out.println("-------");
    }
}
