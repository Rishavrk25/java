package Sorting;

public class QuickSort {
    // tc: O(n log n) on average and O(n^2) in worst case
    // sc: O(log n) for recursive stack space
     static void quickSort(int arr[], int low, int high) {
        // code here
        if(low>=high) return;
        int pi=partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        
    }
    static void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    static int partition(int arr[], int low, int high) {
        
        // your code here
        int mid=(low+high)/2;
        int ele=arr[mid];
        int c=0;
        for(int i=low;i<=high;i++){
            if(arr[i]<ele) c++;
        }
        int pi=c+low;
        swap(arr,mid,pi);
        int i=low;
        int j=high;
        while(i<pi && j>pi){
            if(arr[i]<arr[pi]) i++;
            else if(arr[j]>=arr[pi]) j--;
            else swap(arr,i++,j--);
        }
        return pi;
        
        
    }
}
