package sample;

import java.util.Scanner;
public class ScannerEx {
void call(String namei, int agei){

        for(int i=1;i<=5;i++){


        System.out.println("ur age is"+agei);
        System.out.println("ur name is"+namei);
        }

        }

    public static void main(String[] args) {
    ScannerEx obj = new ScannerEx();

        Scanner o = new Scanner(System.in);
        System.out.println("enter name");
        String name=o.next();
        System.out.println("enter age");
        int age=o.nextInt();
    obj.call(name ,age);


    }
}
