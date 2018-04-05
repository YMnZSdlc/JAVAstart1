package pl.sda.javastart.day1;

import java.time.LocalDateTime;

public class Tasks {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 3;
        int wynik=a%b%c;
        System.out.println("Reszta z dzielenia: " + wynik);

        LocalDateTime teraz = LocalDateTime.now();
        int minute = teraz.getMinute();
        int hour = teraz.getHour();
        int year = teraz.getYear();
        int month = teraz.getMonthValue();
        int day = teraz.getDayOfMonth();

        String monthValue = month < 10 ? "0" + month: "" + month;

        System.out.println(hour+":"+minute+" "+day+"."+monthValue+"."+year);
        int minAftMid = hour*60+minute;
        System.out.println("Od północy mineło: "+ minAftMid);

        int perOfDay = 100*minAftMid/1440;
        System.out.println("Mneło: "+perOfDay+"% doby");

        int era = 24 * 60;
        System.out.println("Do końca doby pozosyało: "+(era - minAftMid));

    }
}
