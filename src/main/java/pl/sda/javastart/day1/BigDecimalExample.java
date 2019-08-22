package pl.sda.javastart.day1;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        double x = 0.02;
        double y = 0.03;
        double z = x - y;

        System.out.println("Odejmowanie bez Big Decimal 0,02-0,03= " + z);

        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");
        BigDecimal c = new BigDecimal("0.07");

        a = a.subtract(b);
        System.out.println("Odejmowanie z Big Decimal 0,02-0,03= " + a);
        c = c.subtract(a);

        System.out.println("Dodatkowy gówno przykład na 0,07+0,01=" + c);
    }
}
