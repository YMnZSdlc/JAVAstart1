package pl.sda.javastart.day3;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

public class Car {
    private String model;
    private String manufacturer;
    private String colour;
    private double basePrice;
    private double engineCapacity;
    private int hp;
    private LocalDateTime manufacturedDate;
    private String[] options;
    private int doorNumbers;

    public String getManufacuredAndModel() {
//        return manufacturer + " " + model;

//        return  manufacturer == null ? "" : manufacturer + " " + model == null ? "" : model;

        return StringUtils.defaultIfBlank(manufacturer, "") + StringUtils.defaultString(model, "");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public LocalDateTime getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDateTime manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getDoorNumbers() {
        return doorNumbers;
    }

    public void setDoorNumbers(int doorNumbers) {
        this.doorNumbers = doorNumbers;
    }
}
