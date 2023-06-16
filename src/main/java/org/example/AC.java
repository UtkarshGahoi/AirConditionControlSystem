package org.example;

import java.util.Stack;

import static org.example.Room.Roomtemprature;

public class AC {

    public static String state="";

    public static Integer temprature=0;

    public static void turnOn(){
        System.out.println("turning on the ac");
    }
    public static void turnOff(){
        System.out.println("turning off the ac");
    }
    public void setToCool(Integer temprature){
     this.temprature=temprature;
     while (Roomtemprature>temprature)
     {
         Roomtemprature-=1;
     }
     state="standBy";
     System.out.println("set the AC TO STAND BY");
    }
    public static void setToHot(){
        System.out.println("set to hot");
    }

}
