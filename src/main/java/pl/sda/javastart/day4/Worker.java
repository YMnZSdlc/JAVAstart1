package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class Worker extends Person {
    private double salary;
    private String position;



    public Worker(String name, String surName, int age, double salary, String position) {
        super(name, surName,age);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public double geIncome() {
        return super.geIncome() + salary;
    }


}
