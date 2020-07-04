package com.codedifferently;

public class CalcFeatures {
    
    private final static double  PI = 3.14;
    private double currentValue;

    public CalcFeatures(){
        currentValue = 0;
    }

    public CalcFeatures(int num){
        currentValue = num;
    }

    public double getPi(){
        currentValue = PI;
        return currentValue;
    }

    public double getCurrentValue(){
        return currentValue;

    }

    public void reset(){
        currentValue = 0;
    }

    public double add(double num){
        currentValue += num;
        System.out.println(currentValue);
        return currentValue;
    }

    public double sub(double num){
        currentValue -= num;
        System.out.println(currentValue);
        return currentValue;
    }

    public double mult(double num){
        currentValue *= num;
        System.out.println(currentValue);
        return currentValue;
    }

    public double div(double num){
        if(num == 0){
            System.out.println("Err: Divide by Zero");
            return currentValue;
        }
        else{
            currentValue /= num;
            System.out.println(currentValue);
            return currentValue;
        }
    }

    public double mod(double num){
        currentValue %= num;
        System.out.println(currentValue);
        return currentValue;
    }

    public double exp(double num){
        currentValue = Math.pow(currentValue, num);
        System.out.println(currentValue);
        return currentValue;
    }

    public double squared(){
        currentValue = Math.pow(currentValue, 2.0);
        System.out.println(currentValue);
        return currentValue;
    }

    public double sqrt(){
        currentValue = Math.sqrt(currentValue);
        System.out.println(currentValue);
        return currentValue;
    }

    public double inv(){
        if(currentValue == 0){
            System.out.println("Err: Divide by Zero");
            return currentValue;
        }
        else{
            currentValue = 1/currentValue;
            System.out.println(currentValue);
            return currentValue;
        }
    }

    public double changeSign(){
        if(currentValue == 0){
            return 0;
        }
        else{
            currentValue *= -1;
            System.out.println(currentValue);
            return currentValue;
        }
    }

    public int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num-1);
    }

    public int fib(int num){
        if(num <= 0){
            return 0;
        }
        if(num <= 2){
            return 1;
        }
        else
            return fib(num-2)+ fib(num-1);
    }

    public double sine(){
       currentValue = Math.sin(currentValue);
       System.out.println(currentValue);
       return currentValue;
    }

    public double cosine(){
        currentValue = Math.cos(currentValue);
        System.out.println(currentValue);
        return currentValue;
     }
     
     public double tangent(){
        currentValue = Math.tan(currentValue);
        System.out.println(currentValue);
        return currentValue;
     }

     public double arcsine(){
        currentValue = Math.asin(currentValue);
        System.out.println(currentValue);
        return currentValue;
     }

     public double arccosine(){
        currentValue = Math.acos(currentValue);
        System.out.println(currentValue);
        return currentValue;
     }

     public double arctangent(){
        currentValue = Math.atan(currentValue);
        System.out.println(currentValue);
        return currentValue;
     }

     public void setCurrentValue(double num){
        currentValue = num;
        System.out.println(currentValue);
     }

}