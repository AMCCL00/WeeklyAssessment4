package com.company.Question_2;

public class houseModel {
    private int floors;
    private int sqFeet;

    public houseModel(int floors, int sqFeet) {
        this.floors = floors;
        this.sqFeet = sqFeet;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }
}

