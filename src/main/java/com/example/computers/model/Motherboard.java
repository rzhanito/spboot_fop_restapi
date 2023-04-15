package com.example.computers.model;

public class Motherboard {
    protected String model;

    public Motherboard(String model) {
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
