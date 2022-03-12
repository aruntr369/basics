package pattern;

public class InvertedhalfpyrNum {
    public static void main(String[] args) {
        int n=1;
        for(int i=5;i>=n;i--){
            for(int j=1; j<=i;j++){
                //or can use j<=n-i
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

