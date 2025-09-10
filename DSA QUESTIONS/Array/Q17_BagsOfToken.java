package Array;
import java.util.Arrays;

public class Q17_BagsOfToken {

    public int bagOfTokensScore(int[] arr, int power) {
        int n=arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        int score=0;
        int mxScore=0;
        while(i<=j){
            if(power>=arr[i]){ // Face UP
                score++;
                mxScore=Math.max(mxScore,score);
                power-=arr[i];
                i++;
            }
            else if(score>=1){ // Face Down
                score--;
                power+=arr[j];
                j--;
            }
            else break;
            
        }
        return mxScore;
    }
}