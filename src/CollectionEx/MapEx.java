package CollectionEx;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer,String> obj = new HashMap();
        obj.put(1,"a");
        obj.put(2,"b");
        obj.put(3,"c");
        //obj to set conversion
        Set obj1 = obj.entrySet();
        Iterator iter =obj1.iterator();
        while (iter.hasNext()){
            Map.Entry ent =(Map.Entry)iter.next();
            System.out.print(ent.getValue());
            System.out.print(ent.getKey());
            System.out.println();
        }
    }
}
