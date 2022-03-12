package pack1;

public class B extends A{
    public static void main(String[] args) {

        B obj= new B();
        obj.ff();
        System.out.println(obj.getName());
        obj.setName("anu");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
