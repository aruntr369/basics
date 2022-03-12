package sample;

public class Addofarrays {
    public static void main(String[] args) {
        int a[][] ={{1,2},{3,4}};
        int b[][] ={{2,3},{3,4}};
        int sum[][] =new int[2][2];
            for(int r =0;r<2;r++){
                for(int c =0;c<2;c++){
                    sum[r][c] = a[r][c]+b[r][c];
                    System.out.print(sum[r][c]+" ");
                }
                System.out.println();
            }
    }

}
