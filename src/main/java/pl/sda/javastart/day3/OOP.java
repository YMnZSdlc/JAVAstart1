package pl.sda.javastart.day3;

public class OOP {
    public static void main(String[] args) {
//        cars();
        referencesExample();


    }

    private static void referencesExample() {
        String text1 = "napis";
        String text2 = "napis";
        String text3 = new String("napis");

        System.out.println(text1==text2);
        System.out.println(text3==text2);

        Long val1 =127L;
        Long val2 =127L;

        System.out.println(val1==val2);

        Long val3 =128L;
        Long val4 =128L;

        System.out.println(val3==val4);

        long number1 = 1234L;
        long number2 = 1234L;
        long number3 = 1234L;
        long number4 = 1234L;
        long number5 = new Long(1234L);

        System.out.println(number1==number2);
        System.out.println(number1==number4);
        System.out.println(number2==number3);
        System.out.println(number5==number4);


    }

    private static void cars() {
        Car car = new Car();
        car.setModel("A4");
        car.setManufacturer("Audi");
        car.setColour("green");
        car.setDoorNumbers(5);
        car.setBasePrice(200000);
        String[] optionForMy = new String[]{"coś tam", "inne"};
        car.setOptions(optionForMy);

        Car audi = new Car("Audi", "A3");

        Car car2 = new Car();
        car2.setManufacturer("      ");
        String mAnufacturerAndModel = car2.getManufacuredAndModel();
        System.out.println("Samochód: " + mAnufacturerAndModel + "!");

        Car myFirstCar = new Car();
        myFirstCar.setManufacturer("Skoda");
        myFirstCar.setModel("Fabia");
        String[] options = new String[]{"Air Conditioning", "Leather Interior"};
        myFirstCar.setOptions(options);
        myFirstCar.setColour("White");
        System.out.println(myFirstCar);
    }
}
