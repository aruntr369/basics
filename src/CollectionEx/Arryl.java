package CollectionEx;

import java.util.*;

public class Arryl {
    public static void main(String[] args) {
        List obj = new ArrayList<>();
        obj.add("aa");
        obj.add("bb");
        obj.add("cc");
                    // out put
//        for(int i=0;i<obj.size();i++){
//            System.out.println(obj.get(i));
//        }
        System.out.println(obj);
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
