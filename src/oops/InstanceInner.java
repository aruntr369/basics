package oops;

/**public class InstanceInner {
     class InnerClass {
        String name ="aaa";
        void display(){
            System.out.println("display");
        }
    }
    void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {
        InstanceInner obj =new InstanceInner();
        obj.show();
        InstanceInner.InnerClass objinner =obj.new InnerClass();
        objinner.display();
    }

}
 */
public class InstanceInner {
    static  class InnerClass {
        String name ="aaa";
        void display(){
            System.out.println("display");
        }
    }
    void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {
        InstanceInner obj =new InstanceInner();
        InnerClass objinner =new InnerClass();
        obj.show();
        objinner.display();
    }

}