package pl.sda.javastart.day1;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HelloWorld {

    public static void main(String[] srgs) {
//        methodName();
//        printTextPartOne();
//        printTextPartTwo();
//        printTextPartThree();
        printLogicOperatorExampleFromPresentation();
    }

    public static void methodName() {
        System.out.println("Hello World!".toUpperCase());
        System.out.println(LocalDateTime.now());
        System.out.println("Adam" + 4 + false);
        System.out.println("Michał");
        System.out.println("Marcin\n" + "Dominik\n" + "Robert\n");
        System.out.println("\\Marcin\nDominik\nRobert\n");

    }

    public static void printTextPartOne() {
        System.out.println("\"Hello World\"");
        System.out.println("Godzina: " + LocalTime.now());
        System.out.println("Data: " + LocalDate.now());
        System.out.println();
        System.out.println("Adam\nMichał\nAneta");
        System.out.println("Adam" + 5 + true);
        System.out.println("Adam" + 5454 + 'b');
        System.out.println('b' + 5454 + "Adam");
    }

    public static void printTextPartTwo() {
        System.out.println("\"Hello world\"".toUpperCase());
        int weight = 75;
        System.out.printf("Michał waży %d kilogramów\n", weight);
        float weight1 = 75.68f;
        System.out.printf("Michał waży %.1f kilogramów", weight1);
    }

    public static void printTextPartThree() {
        boolean x = false == false;
        System.out.println(x);
        System.out.println(false == false);
        System.out.println(false != true);
        System.out.println(!true);
        System.out.println(2 > 4);
        System.out.println(3 < 5);
        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);
        System.out.println((2 + 4) > (1 + 3));
        System.out.println("abc" == "abc");
        System.out.println("abc" == new String("abc"));
        System.out.println("abc".equals(new String("abc")));
        System.out.println((2 + 4) > (1 + 3));
    }

    public static void printLogicOperatorExampleFromPresentation() {
        String aString = null;
//        System.out.println(aString != null & aString.equals("lala"));
        System.out.println(aString != null && aString.equals("lala"));
//        System.out.println(aString == null | !aString.equals("lala"));
        System.out.println(aString == null || !aString.equals("lala"));
//        System.out.println(!aString.equals("lala"));
//        System.out.println(aString.equals("lala"));
        System.out.println(aString == null);
        System.out.println(aString != null);

    }
}
