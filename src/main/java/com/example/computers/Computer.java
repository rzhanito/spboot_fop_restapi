package com.example.computers;

public class Computer {
    protected int id;
    protected int ram;
    protected Processor processor;
    protected Graphic graphic;
    protected Motherboard motherboard;
    protected OS os;
    protected double price;
    public Computer(){

    }

    public Computer(int id, int ram, Processor processor, Graphic graphic, Motherboard motherboard, OS os, double price) {
        this.id = id;
        this.ram = ram;
        this.processor = processor;
        this.graphic = graphic;
        this.motherboard = motherboard;
        this.os = os;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Graphic getGraphic() {
        return graphic;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public OS getOs() {
        return os;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id+ ";" +ram+ ";" +processor+ ";" +graphic+ ";" +motherboard+ ";" +os+ ";" +price + ";";
    }
}

