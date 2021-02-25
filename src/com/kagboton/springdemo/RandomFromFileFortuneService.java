package com.kagboton.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@Component
public class RandomFromFileFortuneService implements FortuneService {

    ArrayList<String> fortunes = new ArrayList<>();

    //read fortunes from a file and load them in an array
    @PostConstruct
    public void readFortuneFile(){
        //load the file from the classpath
        File file = new File("happyFortunes.txt");
        Scanner reader;

        System.out.println(">> RandomFromFileFortuneService :: read fortunes from file starts");
        try {
            reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                fortunes.add(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(">> RandomFromFileFortuneService :: read fortunes from file ends");
    }


    // return a random fortune from the array
    @Override
    public String getDailyFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
