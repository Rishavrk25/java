
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
    int min=0;
    int max=0;
    if(arr[0]>arr[1]){
        max=arr[0];
        min=arr[1];
    }
    else{
        max=arr[1];
        min=arr[0];
    }
    for(int i=2;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }
    }
    Pair<Integer,Integer> pair= new Pair<>(min,max);
    return pair;
        
    }
}
