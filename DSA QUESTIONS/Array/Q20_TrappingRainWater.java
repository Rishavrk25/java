package Array;

public class Q20_TrappingRainWater {
  public int trap(int[] arr) {
        int n=arr.length;
        // prev greatest element
        int prev[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            prev[i] = max;
        }
        // next greatest element
        int next[] = new int[n];
        max = 0;
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,arr[i]);
            next[i]=max;
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.min(prev[i],next[i]) - arr[i];
        }
        return ans;
        
    }
}
