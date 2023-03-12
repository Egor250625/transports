package com.example;

public abstract class Transports {
    String size;

    public Transports(String size) {
        this.size = size;
    }

    public abstract String printInformation();

    public abstract String travelTime();

    public abstract String comfort();

    public abstract double countFee();

    public abstract int numberOfPassangers();
}

