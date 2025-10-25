package Sorting;

public class SelectionSort {
  void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
}
