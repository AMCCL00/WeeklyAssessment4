package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

   /*
   Andrew McClary
    YOUR NAME HERE! - No really put your name here so we know who this belongs to when we grade it <3
     */
    ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */
         Main main = new Main();
         main.AddToArrayList();
         main.displayArray();
    }
    private void AddToArrayList(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
    }
    private void displayArray(){
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
