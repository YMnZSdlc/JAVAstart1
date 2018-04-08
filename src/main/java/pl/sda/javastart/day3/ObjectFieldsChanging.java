package pl.sda.javastart.day3;

public class ObjectFieldsChanging {
    public static void main(String[] args) {
//        simpleReferences();
        changingObjectInternalByReferences();

    }

    private static String addUndercore (String text){

    }

    private static void changingObjectInternalByReferences(){
        ExperminetalObject reference1 = new ExperminetalObject(123);
        ExperminetalObject reference2 = reference1;
        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        reference1.setAttribute(2);

        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());
    }

    private static void simpleReferences() {
        Object referenceToObjectX = new Object();
        Object anotherReferenceToTheSameObjectX = referenceToObjectX;
        Object referenceToObjectY = new Object();

        System.out.println(referenceToObjectX);
        System.out.println(anotherReferenceToTheSameObjectX);
        System.out.println(referenceToObjectY);
    }
}
