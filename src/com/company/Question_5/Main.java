package com.company.Question_5;

import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */
         Main main = new Main();
         main.switchStatment();


    }
    private void switchStatment(){
        System.out.println("Which pet would you like the most: " +
                "A Dog, A Cat, A Ferret or A Bird? (It is case sensitive)");
        try{
            switch (input.nextLine()){
                case "A Dog":
                    //Dog
                    break;
                case "A Cat":
                    //Cat
                    break;
                case "A Ferret":
                    //Ferret
                    break;
                case "A Bird":
                    //Bird
                    break;
                default:
                    System.out.println("Please enter one of the listed pets.");
                    switchStatment();
            }
        }catch(Exception e){
            input.nextLine();
            System.out.println("Please enter one of the listed pets.");
            switchStatment();
        }
    }
}
