package pl.sda.javastart.day4repeat;

public abstract class PersonRepeat {
    private String name;
    private String surName;
    private Integer age;

    public PersonRepeat(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public PersonRepeat(String name, String surName, Integer age) {
        this.name = name;
    }

    public PersonRepeat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonRepeat{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
