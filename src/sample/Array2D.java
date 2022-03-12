package sample;

import java.util.Scanner;

public class Array2D {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("enter no of columns");
//        int m = obj.nextInt();
//        System.out.println("enter no of rows");
//        int n = obj.nextInt();
//        System.out.println("enter values");
//        String[][] array = new String[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <m; j++) {
//                array[i][j] = obj.next();
//            }
//        }
//        System.out.println("----your values are----");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <m; j++) {
//
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("end");
//
//    }

        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter no of columns");
            int m = obj.nextInt();
            System.out.println("enter no of rows");
            int n = obj.nextInt();
            System.out.println("enter values");
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = obj.nextInt();
                }
            }
            //find x
            System.out.println("enter no to find");
            int x = obj.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == x) System.out.println("find x at " + n + "," + m);
                }
            }
        }
}