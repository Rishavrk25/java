

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(76,"Raghav");
        map.put(80,"Himanshu");
        map.put(82,"Ayushi");
        map.put(88,"Prachi");
        for(Integer key:map.keySet()){
            System.out.print(key+" "+map.get(key));
            System.out.println();
        }
    }
}
