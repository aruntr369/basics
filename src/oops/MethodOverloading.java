
    package oops;

    public class MethodOverloading {
        //default function
        void add(){
            int a = 10;
            int b = 30;
            System.out.println("sum = " +(a+b));
            this.add(10,20);
        }
        //parameterized func with 2 parameters of  same datatype
        void add(int a , int b){

            System.out.println("sum = " +(a+b));
        }
        void add(String a , int b){

            System.out.println( "my name is "+b+" i am "+a +"yrs old");
        }
        public static void main(String[] args) {
            //object creation
            MethodOverloading obj = new MethodOverloading();

            obj.add("anu",20);
            obj.add();
           // obj.add(10,20);
        }
    }
