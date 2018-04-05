package pl.sda.javastart.day1;

import java.time.LocalDateTime;

public class Cat {

    private String name;
    private double weight;
    private String ownerName;
    private LocalDateTime dateOfBirth;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}