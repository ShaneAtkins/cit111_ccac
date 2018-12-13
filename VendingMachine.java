/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingMachine;




import java.util.Scanner;
/**
 *
 * @author Shane.Atkins
 */
public class VendingMachine {
    
    //used for restocking machine
    private static void main() {
        System.out.println("Restocked!");
        display();
    }
    //list of items in machine
    int Chips = 1;
    int Candy = 2;
    int Donuts = 3;
    int Doritos = 10;
    int Lays = 12;
    int Fritos = 14;
    int Ruffles = 16;
    int Hershey = 20;
    int Reeses = 22;
    int Starburst = 24;
    int Crunch = 26;
    int Glazed = 30;
    int Powdered = 32;
    int Cinnamon = 34;
    int Chocolate = 36;
    
    public static void main(String[] args) {
        display();
    }//end main

    public static void display() {

        String password = "restocK";
        String restock;
        String restockTwo;
        int credit;
        int typeSnack;
        int snacksLeft = 20;
        Scanner scan = new Scanner(System.in);
        
        //The machine runs until it runs out of snacks
        while (snacksLeft >= 1) {
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("=================================");
            System.out.println("Welcome, each item is one dollar.");
            System.out.println("Please enter an amount in dollars.");
            System.out.println("=================================");
            System.out.println("  ");
            
            //tracks money
            credit = scan.nextInt();
            while (credit >= 1) {
                System.out.println("  ");
                System.out.println("You have " + credit + " dollars left.");
                
                //choose first type of snack
                System.out.println("Please make a selection");
                System.out.println("For chips press 1");
                System.out.println("For candy press 2");
                System.out.println("For donuts press 3");
                System.out.println("  ");
                
                //choose which snack
                typeSnack = scan.nextInt();
                switch (typeSnack) {
                    case 1:
                        System.out.println("  ");
                        System.out.println("For Doritos press 10");
                        System.out.println("For Lays press 12");
                        System.out.println("For Fritos press 14");
                        System.out.println("For Ruffles press 16");
                        System.out.println("  ");
                        snacksLeft = snacksLeft - 1;
                        credit = credit - 1;
                        selection();
                        break;
                    case 2:
                        System.out.println("  ");
                        System.out.println("For Hershey Bar press 20");
                        System.out.println("For Resse's Cups press 22");
                        System.out.println("For Starbursts press 24");
                        System.out.println("For Crunch Bar press 26");
                        System.out.println("  ");
                        snacksLeft = snacksLeft - 1;
                        credit = credit - 1;
                        selection();
                        break;
                    case 3:
                        System.out.println("  ");
                        System.out.println("For Glazed Donuts press 30");
                        System.out.println("For Powdered Donuts press 32");
                        System.out.println("For Cinnamon Donuts press 34");
                        System.out.println("For Chocolate Donuts press 36");
                        System.out.println("  ");
                        snacksLeft = snacksLeft - 1;
                        credit = credit - 1;
                        selection();
                        break;
                    default:
                        System.out.println("Please make a selection from 1-3");
                }//end switch
            }//end inner loop
        }//end outer loop
        
        //allows machine to be refilled
        System.out.println("Out of snacks, please call operator to refill.");
        restock = scan.next();
        if (restock.equals(password)) {
            main();
        } else {
            System.out.println("Seriously, get the operator to refill.");
            restockTwo = scan.next();
            if (restockTwo.equals(password)) {
                main();   }
        }//end if/else
    }//end display

    public static void selection(){
        
        Scanner scanning = new Scanner(System.in);
        int selection;
        
        selection = scanning.nextInt();
        switch (selection) {

            case 10:
                System.out.println("  ");
                System.out.println("You chose Doritos, enjoy!");

                break;
            case 12:
                System.out.println("  ");
                System.out.println("You chose Lays, enjoy!");

                break;
            case 14:
                System.out.println("  ");
                System.out.println("You chose Fritos, enjoy!");

                break;
            case 16:
                System.out.println("  ");
                System.out.println("You chose Ruffles, enjoy!");

                break;
            case 20:
                System.out.println("  ");
                System.out.println("You chose the Hershey Bar, enjoy!");

                break;
            case 22:
                System.out.println("  ");
                System.out.println("You chose the Reese's Cups, enjoy!");

                break;
            case 24:
                System.out.println("  ");
                System.out.println("You chose Starbursts, enjoy!");

                break;
            case 26:
                System.out.println("  ");
                System.out.println("You chose the Crunch Bar, enjoy!");

                break;
            case 30:
                System.out.println("  ");
                System.out.println("You chose the Glazed Donuts, enjoy!");

                break;
            case 32:
                System.out.println("  ");
                System.out.println("You chose the Powdered Donuts, enjoy!");

                break;
            case 34:
                System.out.println("  ");
                System.out.println("You chose the Cinnamon Donuts, enjoy!");

                break;
            case 36:
                System.out.println("  ");
                System.out.println("You chose the Chocolate Donuts, enjoy!");

                break;
            default:
                System.out.println("  ");
                System.out.println("Please select one of the given numbers.");
                selection();
        }//end switch
    }//end selection
}//end class