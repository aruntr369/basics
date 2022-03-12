package oops;

/*abstract class Myinter{
    abstract void show();
}

public class AnonymousInner {
    public static void main(String[] args) {
        Myinter obj = new Myinter() {
            @Override
            void show() {
                System.out.println("inner");

            }
        };
        obj.show();
    }

}

 */
interface Myinter{
     void show();
}
interface Myinter2{
    void show2();
}

public class AnonymousInner {
    public static void main(String[] args) {
        Myinter obj = new Myinter() {
            @Override
            public void show() {
                System.out.println("inner");
            }
        };
        obj.show();
        Myinter2 obj2 = new Myinter2() {
            @Override
            public void show2() {
                System.out.println("intter2");
            }
        };
        obj2.show2();
    }

}


