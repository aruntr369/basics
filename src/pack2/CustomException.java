package pack2;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
public class CustomException {
    static void mark(int mark) throws MyException{
        if (mark < 40){
            throw new MyException("Failed since mark is "+mark);
        }else{
            System.out.println("Pass");
        }
    }
    public static void main(String[] args) {
        try {
            mark(5);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}