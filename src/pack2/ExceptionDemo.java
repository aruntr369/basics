package pack2;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {

            int div = 10 / 0;
            System.out.println(div);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally block is Always executed");
        }
        System.out.println("remaining codes");
    }
}