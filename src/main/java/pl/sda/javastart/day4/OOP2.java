package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class OOP2 {
    public static void main(String[] args) {
        Person simplePerson = new Person("TOmasz");
        Person pensioner = new Pensioner("Adma", "Nowak", 78, 800);
        Person student = new Student("Maciek", "Nowak", 19, 121212, 100, 120);
        Person worker = new Worker("Jan", "Nowak", 30, 1000, "Phisical");
        Person[] people = new Person[]{simplePerson, pensioner, student, worker};

        for (Person person : people) {
            System.out.println(person.getClass().getSimpleName());



        }

        //wyswietl(simplePerson, pensioner, student, worker);
    }

    private static void wyswietl(Person simplePerson, Person pensioner, Person student, Person worker) {
        System.out.println(simplePerson);
        System.out.println(pensioner);
        System.out.println(student);
        System.out.println(worker);

        System.out.println(student.geIncome());
    }

    private static void toStringEqualsExample() {
        User firstUser = new User("Adam", "adam", "pass");
        User secondUser = new User("Adam", "adam", "pass");

        System.out.println(firstUser.equals(secondUser));
        System.out.println(firstUser == secondUser);

        System.out.println(firstUser.toString());
        System.out.println(firstUser);
    }
}
