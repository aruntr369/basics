package sample;

public class MyArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        disp(a);
    }
//calling fun with out obj creation
    private static void disp(int[] a) {
        int sum =a[0]+a[2];
        System.out.println(sum);
    }
}
