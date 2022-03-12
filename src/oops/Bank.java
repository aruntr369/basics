package oops;

import java.util.Scanner;

public class Bank {
    void deposit(int amount){}
    void blnc_check(int blnc){}
    void withdraw(int amnt){}
}
class Federal extends Bank {
    @Override
    void deposit(int amount) {

    }
}
class SBI extends Bank{
    int blnc = 10000;
    @Override
    void deposit(int amount) {
        System.out.println("new balnc after deposit "+(amount+blnc));
    }
}
class ICICI extends Bank{
    int blnc = 20000;
    @Override
    void withdraw(int amnt) {
        System.out.println("new balnc after withdrawal "+(blnc-amnt));
    }
}
class Mainn{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        int damount = obj.nextInt();
        SBI sbi = new SBI();
        sbi.deposit(damount);
    }
}