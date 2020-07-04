package com.codedifferently;

public class Mode {

    private String dMode;
    private String uMode;
    private int dCount;
    private int uCount;

    public Mode(){
        dMode = "decimal";
        uMode = "degrees";
        dCount = 4;
        uCount = 2;
    }

    public void switchDisplayMode(){
        if(dCount == 5) 
         dCount = 1;
        if (dCount == 1){
            dMode = "binary";
            dCount++;
        }
        else if(dCount == 2){
            dMode = "octal";
            dCount++;
        }
        else if(dCount == 3){
            dMode = "decimal";
            dCount++;
        }
        else if(dCount == 4){
            dMode = "hexadecimal";
            dCount++;
        }
    }

    public void switchUnitsMode(){
        if(uCount == 3) 
         uCount = 1;
        if (uCount == 1){
            uMode = "degrees";
            uCount++;
        }
        else if(uCount == 2){
            uMode = "radians";
            uCount++;
        }
      
    }

    public void switchDisplayMode(String mode){
        if (mode.equalsIgnoreCase("binary")){
            dMode = mode.toLowerCase();
            dCount = 2;
        }
        else if(mode.equalsIgnoreCase("octal")){
            dMode = mode.toLowerCase();
            dCount = 3;
        }
        else if(mode.equalsIgnoreCase("decimal")){
            dMode = mode.toLowerCase();
            dCount = 4;
        }
        else if(mode.equalsIgnoreCase("hexadecimal")){
            dMode = mode.toLowerCase();
            dCount = 5;
        }
    }

    public void switchUnitsMode(String mode){
        if (mode.equalsIgnoreCase("degrees")){
            uMode = mode.toLowerCase();
            uCount = 2;
        }
        else if(mode.equalsIgnoreCase("radians")){
            uMode = mode.toLowerCase();
            uCount = 3;
        }
    }

    public String getUnitsMode(){
        return uMode;
    }

    public String getDisplayMode(){
        return dMode;
    }
}