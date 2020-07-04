package com.codedifferently;

public class Memory {
    
    private double memoryValue;

    public Memory(){
        memoryValue = 0;
    }

    public void addMem(double value){
        memoryValue += value;
        System.out.println("Value in Memory: " + memoryValue);
    }

    public void reset(){
        memoryValue = 0;
    }

    public double recall(){
        System.out.println("Value in Memory: " + memoryValue);
        return memoryValue; 
    }


}