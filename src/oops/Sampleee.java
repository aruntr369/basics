package oops;

class A{

    A(){

        System.out.println("A class default Constructor ");
    }

}
public class Sampleee  extends  A{


    Sampleee(int a){

        System.out.println("child class default Constructor  "+a);
    }
    public static void main(String[] args) {

        Sampleee obj = new Sampleee(1);
    }
}