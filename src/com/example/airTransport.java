package com.example;

public  abstract class  airTransport extends Transports {

    public airTransport(String size) {
        super(size);
    }

    public abstract String classOfService();

}
