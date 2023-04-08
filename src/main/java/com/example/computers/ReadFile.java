package com.example.computers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    ArrayList<Computer> computers = new ArrayList<>();
    public void read(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            Computer comp;
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(";");
                if (arr.length == 7) {
                    int id = Integer.parseInt(arr[0]);
                    int ram = Integer.parseInt(arr[1]);
                    Processor i3 = new Processor(arr[2]);
                    Graphic nvidia = new Graphic(arr[3]);
                    Motherboard mboard = new Motherboard(arr[4]);
                    OS windows = new OS(arr[5]);
                    double price = Double.parseDouble(arr[6]);
                    comp = new Computer(id,ram,i3,nvidia,mboard,windows, price);
                    computers.add(comp);
                }
            }
            reader.close();
        } catch (IOException ignored) {
        }
    }
}
