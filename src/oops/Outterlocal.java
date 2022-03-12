package oops;

public class Outterlocal {
    void show(){
        class LocalInner{
            int a =10;
            int b= 20;
            void sum(){
                System.out.println("sum ="+(a+b));
            }
        }
        LocalInner obj =new LocalInner();
        obj.sum();
        System.out.println("inside show fun");
    }

    public static void main(String[] args) {
        Outterlocal obj = new Outterlocal();
        obj.show();
    }
}
