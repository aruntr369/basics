package sample;

public class Loop {
    public static void main(String[] args) {
  /*      for(int i=20;i>1;i--){
            if(i%4 != 0){
                continue;
            }
            System.out.println(i);
            }

        int b=0;
        for(int a=0;a<=10;a++){
            System.out.println(a);

            b=a+b;
        }
        System.out.println(b);

   */
        //sum of odd & even number
        int e=0;
        int o=0;
        for(int i=0;i<=5;i++) {
            if (i % 2 == 0) {
                e = i + e;
            }
            else{
                o = i+o;
            }
        }
            System.out.println(e);
        System.out.println(o);

    }
}
