package com.example.Land;

import com.example.landTransport;

public class Taxi extends landTransport {
    public Taxi(String size) {
        super(size);
    }

    @Override
    public String printInformation() {
        return "Often used in the city when you need to get from one point to another quickly ";
    }

    @Override
    public String travelTime() {
        return "When you are int the city,the average time 10 minutes.if you need to go out of town average time 30 minutes\n" +
                "\n "+numberOfPassangers() +" | Number of Wheels =  "+ numberOfWheels() +" | " +capacity() +"Fee = "+countFee() +"$" +" | "+comfort() +" | " +travelTime() ;
    };


    private int landingFee;
    private int feeForOneKilometers;

    private int numberOfKilometers;

    public Taxi(String size, int landingFee, int feeForOneKilometers, int numberOfKilometers) {
        super(size);
        this.landingFee = landingFee;
        this.feeForOneKilometers = feeForOneKilometers;
        this.numberOfKilometers = numberOfKilometers;
    }

    public int getLandingFee() {
        return landingFee;
    }

    public void setLandingFee(int landingFee) {
        this.landingFee = landingFee;
    }

    public int getFeeForOneKilometers() {
        return feeForOneKilometers;
    }

    public void setFeeForOneKilometers(int feeForOneKilometers) {
        this.feeForOneKilometers = feeForOneKilometers;
    }

    public int getNumberOfKilometers() {
        return numberOfKilometers;
    }

    public void setNumberOfKilometers(int numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public String comfort() {
        return "Good comfort";
    }

    @Override
    public double countFee() {
        return landingFee + feeForOneKilometers*numberOfKilometers;
    }

    @Override
    public int numberOfPassangers() {
        return 4;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String capacity() {
        return "There are no many free space";
    }
}
