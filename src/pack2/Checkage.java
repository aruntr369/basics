package pack2;

public class Checkage {

    static void check(int age) throws ArithmeticException,NullPointerException{

        if (age < 18 ){
            throw new ArithmeticException("Age is not valid");
        }else{
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            check(2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}