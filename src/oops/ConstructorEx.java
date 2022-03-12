
package oops;

public class ConstructorEx {

    //default
    public ConstructorEx() {
        this("ANNA",20);
        int sum = 10+20;
        System.out.println(sum);
    }

    //parameterized
    ConstructorEx(int a,int b){
        this();
        int sum = a+b;
        System.out.println("sum2= "+sum);
    }

    ConstructorEx(String a, int b){

        System.out.println("my name is "+a+" am "+b+"yrs old");

    }

    public static void main(String[] args) {

        // ConstructorEx obj = new ConstructorEx();
        ConstructorEx obj1 = new ConstructorEx(40,20);
        // ConstructorEx obj2 = new ConstructorEx("Hari", 20);
    }
}