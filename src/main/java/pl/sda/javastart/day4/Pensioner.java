package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class Pensioner extends Person {
    private double pension;


    @Override
    public String toString() {
        return "Pensioner{" + super.toString() +
                "pension=" + pension +
                '}';
    }

    public Pensioner(String name, String surName, int age, double pension) {
        super(name, surName, age);
        this.pension = pension;
    }

    @Override
    public double geIncome() {
        return super.geIncome()+pension;
    }
}
