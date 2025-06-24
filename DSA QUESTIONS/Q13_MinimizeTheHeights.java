import java.util.Arrays;

public class Q13_MinimizeTheHeights {

  // TC = O(nlogn)
  // SC = O(1)

  int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1] - arr[0];
        
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        
        int mn=0;
        int mx=0;
        
        for(int i=0;i<n-1;i++){
            mn=Math.min(smallest, arr[i+1]-k);
            mx=Math.max(largest,arr[i]+k);
            if(mn<0) continue;
            ans=Math.min(ans, mx-mn);
        }
        return ans;
        
        
    }
}
