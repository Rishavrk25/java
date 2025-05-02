package HashSets;
import java.util.HashSet;
public class basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println(set); //prints in random order

        //search
        System.out.println(set.contains(100));
        
        //size
        System.out.println(set.size());

        //remove
        set.remove(10);
        System.out.println(set);
        set.remove(2); // no error if ele does not exist
        System.out.println(set);

        //toArray
        Object arr[]=set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // iterate in hashset
        for (int ele : set) {
            System.out.print(ele+" "); 
            // set.add(1); //error
            // set.remove(1); //error
        }

        //empty set
        set.clear(); 
        System.out.println();
        System.out.println(set);
    }
}
