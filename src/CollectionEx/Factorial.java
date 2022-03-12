package CollectionEx;
//factorial using recurstion
public class Factorial {
    public int rec(int num){
        if(num==1 || num ==0){
            return 1;
        }
        int factnmo =rec(num-1);
        int factn =factnmo*num;
        return factn;
    }


    public static void main(String[] args) {
        int num =5;
        Factorial obj =new Factorial();

        int and =obj.rec(num);
        System.out.println(and);

    }
}
