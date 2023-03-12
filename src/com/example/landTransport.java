package com.example;

public abstract class landTransport extends Transports {
    public landTransport(String size) {
        super(size);
    }
public abstract int numberOfWheels();
    public  abstract String capacity();


}
