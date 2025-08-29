package Array;

public class Q1_minAndmaxInArray {
  public Pair<Integer, Integer> getMinMax(int[] arr) {
    
    // 1. Brute Force - two pass
    //     for loop -> min
    //     for loop -> max
    //     TC = O(n)
    //     SC = O(1)


    // 2. Using Sorting
    //     Arrays.sort(arr);
    //     min=arr[0];
    //     max=arr[n-1];
    //     TC = O(nlogn)
    //     SC = O(1)


    // 3. Using Linear Search - one pass (OPTIMAL)
    //         TC = O(n)
    //         SC = O(1)
      
    if(arr.length==1){
        Pair<Integer,Integer> pair= new Pair<>(arr[0],arr[0]);
        return pair;
        }
        int mn=Integer.MAX_VALUE;
        int mx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mn) mn=arr[i];
            if(arr[i]>mx) mx=arr[i];
        }
        Pair p=new Pair(mn,mx);
        return p;
        
    }
}
}
