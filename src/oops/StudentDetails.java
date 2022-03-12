package oops;

public class StudentDetails {

    static {
        System.out.println("inside static block this will execute first");

    }
    static  void show(){
        System.out.println("inside show functn");

    }
    public static void main(String[] args) {
        show();

        System.out.println("inside main this will execute first");
    }
}