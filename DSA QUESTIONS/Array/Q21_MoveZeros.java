package Array;

public class Q21_MoveZeros {
  public void moveZeroes(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int ele:arr) if(ele==0) c++;
        for(int i=0;i<c;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        // int i=0;
        // int j=0;
        // while(j<n){
        //     if(arr[j]==0) j++;
        //     else{
        //         int temp = arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //         i++;
        //         j++;
        //     }
        // }
    }
}
