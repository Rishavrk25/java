import java.util.Arrays;

public class Q41_KokoEatingBanana {
    int check(int arr[],int h,int k){
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
                int val=(int)Math.ceil((double)arr[i]/k);
                c+=val; 
        }
        return c;
    }
    public int minEatingSpeed(int[] arr, int h) {
        Arrays.sort(arr);
        int n=arr.length;
        int l=1;
        int r=arr[n-1];
        int m=(l+r)/2;
        while(l<r){
            m=(l+r)/2;
            if(check(arr,h,m)<=h) r=m;
            else l=m+1;
        }
        return l;
    }
}
