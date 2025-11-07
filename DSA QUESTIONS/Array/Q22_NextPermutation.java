public class Q22_NextPermutation {
  void reverse(int arr[],int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        // Step 1 -> finding drop from rhs
        int idx=-1;
        for(int i=n-1;i>=1;i--){
            if(arr[i-1]<arr[i]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(arr,0,n-1);
            return;
        }
        // Step-2 -> find ele which is least greater than arr[idx]
        int lg=-1;
        for(int i=n-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                lg=i;
                break;
            }
        }
        swap(arr,lg,idx);
        // Step-3 -> Reverse from idx+1 to n-1
        reverse(arr,idx+1,n-1);
    }
}
