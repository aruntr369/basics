package sample;

public class Variabless {

    void add(){
        int a =20;
        int b = 30;
        int sum = a+b;
        System.out.println("sum = "+sum);
    }

    public Variabless() {
        String name = "arun";
        System.out.println(name);
    }

    public static void main(String[] arys) {
        //classname objectname = newkeyword constructor();
        Variabless localvariables = new Variabless();
        localvariables.add();
    }

}
