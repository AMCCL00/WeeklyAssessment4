package com.company.Question_2;

public class Main {

    public static void main(String[] args) {
        /*
        1. Create a new class in this package that will hold a model for a house (at least 2 Variables, getters, setters and constructor)
        2. Create an instance of the house in the main method here.
         */
        houseModel houseModel = new houseModel(2, 2800);
        System.out.println(houseModel.getFloors() + " floors and " + houseModel.getSqFeet() + " square feet.");
    }
}
