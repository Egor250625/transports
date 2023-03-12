package com.example.Land;

import com.example.landTransport;

public class Bus  extends landTransport {
    public Bus(String size) {
        super(size);
    }
@Override
public String capacity(){
        return "Many free capacity";
}
    @Override
    public String printInformation() {
        return "Public transport with lower fees than taxis "+numberOfPassangers() +" | Number of Wheels =  "+ numberOfWheels() +" | " +capacity() +"Fee = "+countFee() +"$" +" | "+comfort() +" | " +travelTime() ;
    };


    @Override
    public String travelTime() {
        return "depending on stoppage";
    }

    @Override
    public String comfort() {
        return "Not very good";
    }

    @Override
    public double countFee() {
        return 5;
    }

    @Override
    public int numberOfPassangers() {
        return 20;
    }

    @Override
    public int numberOfWheels() {
        return 8;
    }
}
