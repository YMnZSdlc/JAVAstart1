package pl.sda.javastart.day2;

public class Arrays2d {
    public static void main(String[] args) {
//        printGirid(4, 3);
        fillWithNumbers2();
    }

    public static void printGirid(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

//        for (int i:array[0]){
//            for (int j:array[i]) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }

    }

    public static void fillWithNumbers2() {
        int[][] ints = new int[5][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (i == j) {
                    ints[i][j] = i;
                }
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }

}
