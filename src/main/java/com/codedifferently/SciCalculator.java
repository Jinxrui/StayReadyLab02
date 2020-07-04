package com.codedifferently;

import java.util.Scanner;

/**
 * Solomon Jackson
 *
 * This program is to represent the features of a scientific calculator 
 * utilizing the features of CalcFeatures class, Memory class and Mode class.
 */
public class SciCalculator { //Begin SciCalculator
    public static void main( String[] args ){ //begin main
        CalcFeatures calc = new CalcFeatures();
        Memory memory = new Memory();
        Mode mode = new Mode();
        Scanner scan = new Scanner(System.in);
        int select = -1;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Basic Operations (+, -, *, /, %)");
            System.out.println("2. Exponential and Root Operations");
            System.out.println("3. Trigonometric Operations");
            System.out.println("4. Extra Features");
            System.out.println("5. Memory Operations");
            System.out.println("6. Settings (Mode, Units, and more)");
            System.out.println("Press 0 to power off");
            select =  scan.nextInt();

            switch(select){

                case 0: 
                    System.out.println("Power off...");
                    break;
                case 1: 
                    bOperations(calc);
                    break;

                case 2:
                    erOperations(calc);
                    break;
                case 3:
                    tOperations(calc);
                    break;
                case 4:
                    extraOps(calc);
                    break;
                case 5:
                    memory(calc, memory);
                    break;
                case 6:
                    settings(calc, mode);
                    break;
                default:
                    System.out.println("Err: " + select  + " is not a listed option");
            }
         }while(select != 0);
    } //end main

    public static void changeDisplayMode(Mode mode){//begin changeDisplayMode
        int select = -1;
        Scanner scan =  new Scanner(System.in);
        do{
            System.out.println("Display Mode Options: ");
            System.out.println("1. Change Display Manually.");
            System.out.println("2. Change Display Autoatically");
            System.out.println("Press 0 to exit display mode options.");
            select = scan.nextInt();

            switch(select){
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    System.out.println("Changing Display Mode: (Binary, Octal, Decimal, Hexadecimal)");
                    String input = scan.next();
                    mode.switchDisplayMode(input);
                    System.out.println("Display mode set to: " +  mode.getDisplayMode());
                    break;
                case 2:
                    System.out.println("Changing Display Mode...");
                    mode.switchDisplayMode();
                    System.out.println("Display mode set to: " +  mode.getDisplayMode());
                    break;
                default:
                System.out.println("Err: " + select  + " is not a listed option");
            }
        }while(select != 0);
    } //end changeDisplayMode

    public static void changeUnitsMode(Mode mode, CalcFeatures calc){ //begin changeUnitsMode
        int select = -1;
        Scanner scan =  new Scanner(System.in);
        do{
            System.out.println("Units Mode Options: ");
            System.out.println("1. Change Units Manually.");
            System.out.println("2. Change Units Automatically");
            System.out.println("Press 0 to exit unit mode options.");
            select = scan.nextInt();

            switch(select){
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    System.out.println("Changing Units Mode: (Degrees, Radians)");
                    String input = scan.next();
                    mode.switchUnitsMode(input);
                    System.out.println("Units mode set to: " +  mode.getUnitsMode());
                    if(mode.getUnitsMode().equals("Degrees"))
                        calc.setCurrentValue(Math.toDegrees(calc.getCurrentValue()));
                    else
                        calc.setCurrentValue(Math.toRadians(calc.getCurrentValue()));
                    calc.getCurrentValue();
                    break;
                case 2:
                    System.out.println("Changing Units Mode...");
                    mode.switchUnitsMode();
                    System.out.println("Units mode set to: " +  mode.getUnitsMode());
                    if(mode.getUnitsMode().equals("Degrees"))
                        calc.setCurrentValue(Math.toDegrees(calc.getCurrentValue()));
                    else
                        calc.setCurrentValue(Math.toRadians(calc.getCurrentValue()));
                    calc.getCurrentValue();
                    break;
                default:
                System.out.println("Err: " + select  + " is not a listed option");
            }
        }while(select != 0);
    }//end changeUnitsMode

    public static void memory(CalcFeatures calc, Memory memory){//begin memory
        int select = -1;
        Scanner scan =  new Scanner(System.in);
        do{
            System.out.println("Memory Options: ");
            System.out.println("1. M+");
            System.out.println("2. MC");
            System.out.println("3. MCR");
            System.out.println("Press 0 to exit memory options");
            select =  scan.nextInt();

            switch(select){
                case 0: 
                    System.out.println("Exiting...");
                    break;

                case 1: 
                    memory.addMem(calc.getCurrentValue());
                    break;
                case 2:
                    memory.reset();
                    break;
                case 3:
                    memory.recall();
                    break;
                default:
                    System.out.println("Err: " + select  + " is not a listed option");
            }
        }while(select!=0);
    }//end memory

    public static void bOperations(CalcFeatures calc){//begin bOperations
        int select = -1;
        double  num =  0;
        Scanner scan  = new Scanner (System.in);
        do{
            System.out.println("Basic Operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Mod");
            System.out.println("Press 0 to exit basic operations");
            select =  scan.nextInt();

            switch(select){
                case 0: 
                    System.out.println("Exiting...");
                    break;
                case 1: 
                    System.out.println("Enter a number to add by:");
                    num = scan.nextDouble();
                    calc.add(num);
                    break;
                case 2:
                    System.out.println("Enter a number to subtract by:");
                    num = scan.nextDouble();
                    calc.sub(num);
                    break;
                case 3:
                    System.out.println("Enter a number to multiply by:");
                    num = scan.nextDouble();
                    calc.mult(num);
                    break;
                case 4:
                    System.out.println("Enter a number to divide by:");
                    num = scan.nextDouble();
                    calc.div(num);
                    break;
                case 5:
                    System.out.println("Enter a number to mod by:");
                    num = scan.nextDouble();
                    calc.mod(num);
                    break;
                default:
                    System.out.println("Err: " + select  + " is not a listed option");
            }
        }while(select!=0);
    }//end bOperations

    public static void tOperations(CalcFeatures calc){//begin tOperations
        int select = -1;
        Scanner scan  = new Scanner (System.in);
        do{
            System.out.println("Trigonometric Operations: ");
            System.out.println("1. Sine");
            System.out.println("2. Cosine");
            System.out.println("3. Tangent");
            System.out.println("4. Arcsine");
            System.out.println("5. Arccosine");
            System.out.println("6. Arctangent");
            System.out.println("Press 0 to exit trigonometric operations");
            select =  scan.nextInt();

            switch(select){
                case 0: 
                    System.out.println("Exiting...");
                    break;
                case 1: 
                    calc.sine();
                    break;
                case 2:
                    calc.cosine();
                    break;
                case 3:
                    calc.tangent();
                    break;
                case 4:
                    calc.arcsine();
                    break;
                case 5:
                    calc.arccosine();
                    break;
                case 6:
                    calc.arctangent();
                    break;
                default:
                    System.out.println("Err: " + select  + " is not a listed option");
            }
        }while(select!=0);
    }//end tOperations

        public static void erOperations(CalcFeatures calc){//begin erOperations
            int select = -1;
            double num = 0;
            Scanner scan  = new Scanner (System.in);
            do{
                System.out.println("Exponential and Root Operations: ");
                System.out.println("1. Squared");
                System.out.println("2. Square Root");
                System.out.println("3. Exponent");
                System.out.println("Press 0 to exit exponential and root operations");
                select =  scan.nextInt();
    
                switch(select){
                    case 0: 
                        System.out.println("Exiting...");
                        break;
                    case 1: 
                        calc.squared();
                        break;
                    case 2:
                        calc.sqrt();
                        break;
                    case 3:
                        System.out.println("Enter the number you would like to raise the power by:");
                        num = scan.nextDouble();
                        calc.exp(num);
                        break;
                    default:
                        System.out.println("Err: " + select  + " is not a listed option");
                }
            }while(select!=0);
        }//end erOperations

        public static void extraOps(CalcFeatures calc){//begin extraOps
            int select = -1;
            int num = 0;
            Scanner scan  = new Scanner (System.in);
            do{
                System.out.println("Extra Operations: ");
                System.out.println("1. Inverse");
                System.out.println("2. Change Sign");
                System.out.println("3. Pi");
                System.out.println("4. Factorial");
                System.out.println("5. Fibonnacci");
                System.out.println("Press 0 to exit extra operations");
                select =  scan.nextInt();
    
                switch(select){
                    case 0: 
                        System.out.println("Exiting...");
                        break;
                    case 1: 
                        calc.inv();
                        break;
                    case 2:
                        calc.changeSign();
                        break;
                    case 3:
                        System.out.println(calc.getPi());
                        break;
                    case 4:
                        System.out.println("Enter a number to get the factorial:");
                        num = scan.nextInt();
                        System.out.println(calc.fact(num));
                        break;
                    case 5:
                        System.out.println("Enter a position number of the fibonacci sequence:");
                        num = scan.nextInt();
                        System.out.println(calc.fib(num));
                        break;
                    default:
                        System.out.println("Err: " + select  + " is not a listed option");
                }
            }while(select!=0);
        }//end extraOps

        public static void settings(CalcFeatures calc, Mode mode){//begin settings
            int select = -1;
            double num = 0;
            Scanner scan  = new Scanner (System.in);
            do{
                System.out.println("Settings: ");
                System.out.println("1. Change Display Mode");
                System.out.println("2. Change Units");
                System.out.println("3. Set Current Value");
                System.out.println("4. Reset");
                System.out.println("Press 0 to exit settings");
                select =  scan.nextInt();
    
                switch(select){
                    case 0: 
                        System.out.println("Exiting...");
                        break;
                    case 1: 
                        changeDisplayMode(mode);
                        break;
                    case 2:
                        changeUnitsMode(mode, calc);
                        break;
                    case 3:
                        System.out.println("Insert a number you would like to set as the current value: ");
                        num = scan.nextDouble();
                        calc.setCurrentValue(num);
                        break;
                    case 4:
                        calc.reset();
                         System.out.println(calc.getCurrentValue());
                        break;
                    default:
                        System.out.println("Err: " + select  + " is not a listed option");
                }
            }while(select!=0);
        }//end settings

}//end SciCalculator
