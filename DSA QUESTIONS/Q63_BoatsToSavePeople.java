import java.util.Arrays;

public class Q63_BoatsToSavePeople {
     public int numRescueBoats(int[] arr, int limit) {
        // GREEDY
        Arrays.sort(arr);
        int n=arr.length;
        int c=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]+arr[j]<=limit){ // pair can be found (heavier + ligher)
                i++;
                j--;
            }
            else j--;
            c++;
        }
        return c;
    }
}
