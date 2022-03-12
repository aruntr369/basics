package sample;

public class Stringsplit {
    public static void main(String[] args) {
        String s ="hai all welcome to java";
        String data[] = s.split("l");
        for(String d:data){
            System.out.println(d);
        }
    }
}
