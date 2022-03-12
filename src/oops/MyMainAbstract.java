package oops;


abstract class Bank1 {

    String bankname;
    int no_of_brannches;
    int amount = 10000;

    void deposit(int amount){
        System.out.println("Balance = "+(amount+this.amount));
    }

    abstract void withdraw(int amount);
}

class Axis extends Bank1{
    //int amount = 20000;
    @Override
    void withdraw(int amount) {
        System.out.println("Balance after withdrawal= "+(super.amount - amount));
    }
}


public class MyMainAbstract {
    public static void main(String[] args) {
        Axis obj = new Axis();
        System.out.println("Bank Name is "+(obj.bankname ="Axis Bank"));
        System.out.println(obj.bankname+" has "+(obj.no_of_brannches=6)+" in kochi");
        obj.deposit(200);
        obj.withdraw(3000);
    }
}
