package com.example.computers;

public class DataModel {
    private String name;
    private String email;
    public DataModel(){

    }
    public DataModel(String name, String email){
         this.name=  name;
         this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
