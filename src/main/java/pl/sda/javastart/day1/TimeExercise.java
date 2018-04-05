package pl.sda.javastart.day1;

import java.time.LocalDateTime;

public class TimeExercise {
    public static void main(String[] args) {
        LocalDateTime nowTest = LocalDateTime.now();
        int year = nowTest.getYear();
        int month = nowTest.getMonthValue();
        int day = nowTest.getDayOfMonth();
        int hour = nowTest.getHour();
        int minute = nowTest.getMinute();
        int second = nowTest.getSecond();

        String monthValue = month < 10 ? "0" + month : "" + month;// jeśli montch mniejszy od 10 to:
        String dayValue = day < 10 ? "0" + day : "" + day; // wykonaywane jest to co między ? i :
        String secValue = day < 10 ? "0" + second : "" + second; //jeśli większy do po :

        System.out.println(hour + "h." + minute + "m." + secValue + "s");
        System.out.println(dayValue + "." + monthValue + "." + year + "r");

        System.out.println("Od północy minęło: " + ((hour * 60) + minute) + " minut.");
        System.out.println("Minęło " + ((hour * 60) + minute)*100/(24*60) + " procent doby");

        int secondInDay = 24 * 60 * 60;
        int hourToSubstract = hour * 60 * 60;
        int minuteToSubstract = minute *60;
        System.out.println("Do końca dnia pozostało: "+ (secondInDay-hourToSubstract-minuteToSubstract)+ " sekund");
    }
}
