package pl.sda.javastart.day1;

public class CatsMain {
    public static void main(String[] args) {
        createCatArrayWithIndexesAdding();
        //createCatArrayWithInicialization();
    }

    private static void createCatArrayWithInicialization() {
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();

        firstCat.setName("Mruczek");
        Cat[] cats = new Cat[]{firstCat, secondCat, thirdCat};

        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }

    private static void createCatArrayWithIndexesAdding() {
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();
        Cat forthCat = new Cat();

        firstCat.setName("HUI");
        secondCat.setName("Miau");
        thirdCat.setName("kici");

        Cat[] cats = new Cat[4];
        cats[0] = firstCat;
        cats[1] = secondCat;
        cats[2] = thirdCat;
        cats[3] = forthCat;

        for (Cat kitty : cats) {
            System.out.println(kitty.getName());
        }
    }
}
