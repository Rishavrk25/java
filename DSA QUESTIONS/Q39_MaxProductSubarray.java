public class Q39_MaxProductSubarray {
    public int maxProduct(int[] arr) {
        int p=1;
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
        // left to right
        for(int i=0;i<n;i++){
            p*=arr[i];
            mx=Math.max(mx,p);
            if(p==0) p=1;
        }
        p=1;
        // right to left
        for(int i=n-1;i>=0;i--){
            p*=arr[i];
            mx=Math.max(mx,p);
            if(p==0) p=1;
        }
        return mx;
    }
}
