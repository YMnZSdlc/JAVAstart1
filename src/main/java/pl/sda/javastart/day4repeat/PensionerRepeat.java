package pl.sda.javastart.day4repeat;

public class PensionerRepeat extends PersonRepeat {
    private double pension; //inCome

    public PensionerRepeat(String name, String surName, int age, double pension) {
        super(name, surName, age);
        this.pension = pension;
    }


}
