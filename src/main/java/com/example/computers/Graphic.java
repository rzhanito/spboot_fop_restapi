package com.example.computers;

public class Graphic {
    protected String model;
    public Graphic(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return model;
    }
}
