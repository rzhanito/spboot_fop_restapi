package com.example.computers;

public class OS {
    protected String name;

    public OS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
