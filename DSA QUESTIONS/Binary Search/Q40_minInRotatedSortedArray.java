public class Q40_minInRotatedSortedArray {
    public int findMin(int[] arr) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        int min=Integer.MAX_VALUE;
        while(l<=h){
           int m=(l+h)/2;
            if(arr[l]<=arr[m]){
                min=Math.min(min,arr[l]);
                l=m+1;
            }
            else{
                min=Math.min(min,arr[m]);
                h=m-1;
            }
        }
        return min;
        
    }
}
