package com.example.Land;

import com.example.landTransport;

public class Train extends landTransport {
    public Train(String size) {
        super(size);
    }


    @Override
    public String travelTime() {
        return "From 1 to 10 hours";
    }

    @Override
    public String comfort() {
        return "Comfortable";
    }

    @Override
    public double countFee() {
        return 15;
    }
int numberOfPassengersInOneWagon ;
    int numberOfWagons;

    public Train(String size, int numberOfPassengersInOneWagon, int numberOfWagons) {
        super(size);
        this.numberOfPassengersInOneWagon = numberOfPassengersInOneWagon;
        this.numberOfWagons = numberOfWagons;
    }

    public int getNumberOfPassengersInOneWagon() {
        return numberOfPassengersInOneWagon;
    }
    @Override
    public String printInformation() {
        return"It is possible to book seats, a lot of space | Number Of Passengers  = "+numberOfPassangers() +" | Number of Wheels =  "+ numberOfWheels() +" | " +capacity() +"Fee = "+countFee() +"$" +" | "+comfort() +" | " +travelTime() ;
    }
    public void setNumberOfPassengersInOneWagon(int numberOfPassengersInOneWagon) {
        this.numberOfPassengersInOneWagon = numberOfPassengersInOneWagon;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public int numberOfPassangers() {
        return numberOfWagons*numberOfPassengersInOneWagon;
    }

    @Override
    public int numberOfWheels() {
        return 48;
    }

    @Override
    public String capacity() {
        return "There are a lot of Space in the Wagon";
    }
}
