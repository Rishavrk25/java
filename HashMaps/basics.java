package HashMaps;

import java.util.HashMap;

public class basics {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // insertion of key,value pair
        map.put("Raghav",76);
        map.put("Rishav",85);
        map.put("Rishu",75);
        System.out.println(map);

        // containsKey() -> search for key
        System.out.println(map.containsKey("Rishav"));

        // containsValue() -> search for value
        System.out.println(map.containsValue(76));
        map.put("Rishu",100);
        System.out.println(map);

        //size
        System.out.println(map.size());

        //remove -> pair
        map.remove("Raghav");
        System.out.println(map);

        //get -> get the value
        System.out.println(map.get("Rishav"));

        // iterate in HashMap
        for (String key : map.keySet()) {
            int val=map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();

        // not so imp
        for (int val : map.values()) {
            System.out.println(val);
        }
        System.out.println();
        for (Object pair : map.entrySet()) {
            System.out.println(pair);
        }




    }
}
