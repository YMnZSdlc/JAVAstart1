package pl.sda.javastart.day2;

public class CodingBat {
    public static void main(String[] args) {

        System.out.println(frontBack("Herbata"));
        System.out.println(frontBack("Aneta"));
        System.out.println(frontBack("Coś"));

    }

    public static String frontBack(String str) {
        String start, end, mid;
        if (str.length() < 2) return str;
        else {
            start = str.substring(0, 1);
            end = str.substring(str.length() - 1);
            mid = str.substring(1, str.length()-1);
            return (end + mid + start);
        }
    }

}
