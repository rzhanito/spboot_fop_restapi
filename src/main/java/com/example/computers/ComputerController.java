package com.example.computers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.util.ArrayList;

@RestController
public class ComputerController {
    @GetMapping("/file")
    public ResponseEntity<ArrayList<Computer>> getFileContent() {
        ReadFile read = new ReadFile();
        read.read("data.txt");
        try {
            return new ResponseEntity<>(read.computers, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/file")
    public ResponseEntity<String> addDataToFile(@RequestBody Computer comp) {
        try {
            FileWriter writer = new FileWriter("data.txt", true);
            writer.write("\n" + comp.toString());
            writer.close();
            return ResponseEntity.ok("Данные были добавлены успешно.");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Ошибка записи в файл.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
