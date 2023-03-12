package com.example;

import com.example.Air.Plane;
import com.example.Land.Bus;
import com.example.Land.Taxi;
import com.example.Land.Train;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Big");
        Taxi taxi = new Taxi("Not very big", 5, 2,10);
        Train train = new Train("Very very big",32,10);
        Plane plane = new Plane("Amazing size");


        System.out.println("****   Land transport    ****");
        System.out.println(taxi.printInformation());
        System.out.println(train.printInformation());
        System.out.println(bus.printInformation());
        System.out.println("""
                """);
        System.out.println("****    Air transport    ****");

        System.out.println(plane.printInformation());
    }
}