package oops;

class Parent{
    void add(int a , int b) {
        System.out.println("sum = " + (a + b));
    }
    void show() {
        System.out.println("inside show method from parent class");
    }
}
public class MethodOverriding extends Parent{

    @Override
    void add(int a, int b) {
        super.show();
        System.out.println("sum is  " + (a + b));
        super.add(100, 200);
    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.add(10,20);
        //obj.show();
    }
}