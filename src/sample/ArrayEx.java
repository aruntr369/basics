package sample;

import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter row and col size");
        int row = obj.nextInt();
        int col = obj.nextInt();
        System.out.println("enter "+ (row*col) + "array elements");

        int a[][] = new int[row][col];

        for(int r = 0 ; r < row ;r++){
            for(int c =0 ; c < col ;c++){
                a[r][c] = obj.nextInt();
            }
        }
        for(int r = 0 ; r < row ;r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}
