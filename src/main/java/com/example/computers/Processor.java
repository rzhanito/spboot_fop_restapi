package com.example.computers;

public class Processor {
    protected String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return model;
    }
}
