package Sorting;

public class InsertionSort {
  //  public void insertionSort(int arr[]) {
  //       // code here
  //       int n=arr.length;
  //       for(int i=1;i<n;i++){
  //           int j=i;
  //           while(j>0){
  //               if(arr[j-1] > arr[j]){
  //                   int temp = arr[j];
  //                   arr[j]=arr[j-1];
  //                   arr[j-1]=temp;
  //               }
  //               j--;
  //           }
  //       }
  //   }


  // RECURSIVE INSERTIOIN SORT
  void helper(int arr[],int i,int n){
        if(i==n) return;
        int j=i;
        while(j>0){
            if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                j--;
        }
        helper(arr,i+1,n);
    }
    public void insertionSort(int arr[]) {
        int n=arr.length;
        helper(arr,1,n);
    }
}
