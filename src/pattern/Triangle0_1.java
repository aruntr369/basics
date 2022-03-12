package pattern;

public class Triangle0_1 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ //even
                    System.out.print(a);
                }else {  //odd
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}
