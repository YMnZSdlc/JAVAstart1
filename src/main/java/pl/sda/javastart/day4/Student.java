package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class Student extends Person {

    //Czym się różni interfejs od klasy abstarkcyjnej?
    //Interfejsy są public z definicji


    private int index;
    private double scolarship;
    private double incomeFromMom;



    public Student(String name, String surName, int age, int index, double scolarship, double incomeFromMom) {
        super(name, surName, age);
        this.index = index;
        this.scolarship = scolarship;
        this.incomeFromMom = incomeFromMom;
    }

    @Override
    public String toString() {
        return super.toString() +
                "index=" + index +
                ", scolarship=" + scolarship +
                ", incomeFromMom=" + incomeFromMom +
                '}';
    }

    @Override
    public double geIncome() {
        return super.geIncome() + scolarship + incomeFromMom;
    }
}
