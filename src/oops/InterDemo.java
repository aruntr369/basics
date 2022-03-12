package oops;

interface  MyInter1{

    String datainter = "This is a msg from interface";

    void show();
}
interface INTER2{

    void display();

}

class B implements MyInter1,INTER2{

    @Override
    public void show() {
        System.out.println("Show method from B"+datainter);
    }

    @Override
    public void display() {
        System.out.println("display method ");

    }
}

public class InterDemo {
    public static void main(String[] args) {
    B obj =new B();
    obj.show();
    obj.display();
    }
}