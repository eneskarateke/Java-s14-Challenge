package com.workintech.java.models;

public class Addition {

    private String additionName;
    private double additionPrice;

    public Addition(String additionName, double additionPrice) {
        this.additionName = additionName;
        this.additionPrice = additionPrice;
    }

    public String getAdditionName() {
        return additionName;
    }


    public double getAdditionPrice() {
        return additionPrice;
    }

}