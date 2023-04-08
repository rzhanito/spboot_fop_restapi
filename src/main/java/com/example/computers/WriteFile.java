package com.example.computers;
import java.io.*;

public class WriteFile {
    public void write(Computer... computers){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            for(Computer i:computers)
                writer.write(i.toString());
            writer.close();
        }
        catch (IOException ignored){
        }
    }
    public void add(Computer... computers){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt",true));
            for(Computer i:computers) {
                writer.write(i.toString());
            }
            writer.close();
        }catch(IOException ignored){
        }
    }
}
