package pattern;

public class Halfpyramid {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            m+=2;
            System.out.println();
        }

    }
}
