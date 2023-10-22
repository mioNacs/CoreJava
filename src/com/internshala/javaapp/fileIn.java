package com.internshala.javaapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileIn {
    public static void main(String[] args) {
        int sd = 0;
            try{
                FileInputStream dsf = new FileInputStream("name.txt");
                int i=0;
                while((i=dsf.read())!= -1){
                    sd=(int)i+1;
                }
                dsf.close();
            }catch (IOException ex){
                System.out.println(ex);
            }
            try{
                FileOutputStream dfs = new FileOutputStream("name.txt");
                dfs.write((int)sd);
                dfs.close();
            }catch (IOException ex){
                System.out.println(ex);
            }

            try{
                FileInputStream dsf = new FileInputStream("name.txt");
                int i=0;
                while((i=dsf.read())!= -1){
                    System.out.println((int)i);
                }
                dsf.close();
            }catch (IOException ex){
                System.out.println(ex);
            }

    }
}
