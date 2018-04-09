package pl.sda.javastart.day3;

public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String tOmasz) {

    }

    public double geIncome(){
        return 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " {name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }
}
