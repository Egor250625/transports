package com.example.Air;

import com.example.airTransport;

public class Plane extends airTransport {
    public Plane(String size) {
        super(size);
    }

    @Override
    public String printInformation() {
        return classOfService()+" |  Number of passangers = " +numberOfPassangers() +" | "+"Fee = "+countFee() +"$" +" | "+comfort() +" | " +travelTime();
    }

    @Override
    public String travelTime() {
        return "From 1 to 12 hours ";
    }

    @Override
    public String comfort() {
        return "Very good level of comfort";
    }

    @Override
    public double countFee() {
        return 100;
    }

    @Override
    public int numberOfPassangers() {
        return 100;
    }

    @Override
    public String classOfService() {
        return "Have bussines and economy class ";
    }
}
