package pl.sda.javastart.testy;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int [] arr = {90,65,3,102,57,2,5,1};
        Arrays.stream(arr)
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();
        Arrays.stream(arr)
                .sorted()
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();
        int [] tab = sort(arr);
        Arrays.stream(tab)
                .forEach(e -> System.out.print(e + ", "));

    }

    public static int[] sort(int[] array) {
        for (int k = 0; k < array.length-1; k++) {
            int min = k;
            for (int i = k; i < array.length; i++) {
                if (array[min]>array[i]){
                    min=i;
                }
            }
            swap(array,min,k);
        }
//        throw new UnsupportedOperationException("Not implemented yet");
        return array;
    }

    private static void swap (int[] arrayToSwap, int a , int b){
        int tmp = arrayToSwap [a];
        arrayToSwap [a] = arrayToSwap [b];
        arrayToSwap [b] = tmp;
    }
}
