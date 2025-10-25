package Sorting;

public class BubbleSort {
  // public void bubbleSort(int[] arr) {
  //   int n = arr.length;
  //   for (int i = 0; i < n - 1; i++) {
  //     boolean flag = true;
  //     for (int j = 0; j < n - 1 - i; j++) {
  //       if (arr[j] > arr[j + 1]) {
  //         int temp = arr[j];
  //         arr[j] = arr[j + 1];
  //         arr[j + 1] = temp;
  //         flag = false;
  //       }
  //     }
  //     if (flag == true)
  //       break;

  //   }
  // }


  //RECURSIVE BUBBLE SORT
  void helper(int arr[],int i,int n){
        if(i==n-1) return;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        helper(arr,i+1,n);
    }
    public void bubbleSort(int[] arr) {
        int n=arr.length;
        helper(arr,0,n);
    }
}
