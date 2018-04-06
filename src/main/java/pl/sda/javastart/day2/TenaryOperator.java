package pl.sda.javastart.day2;

public class TenaryOperator {
    public static void main(String[] args) {
        System.out.println("Liczba " + 3 + " większa od 0 -> " + (numberBiggerThan0(3) ? "tak" : "nie"));
        System.out.println("Liczba " + -2 + " większa od 0 -> " + (numberBiggerThan0(-2) ? "tak" : "nie"));
    }

    public static boolean numberBiggerThan0(int number) {
        return number > 0;
    }
}
