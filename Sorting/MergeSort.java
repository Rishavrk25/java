package Sorting;

public class MergeSort {
    void merge(int arr[],int l,int r,int m){
        int n1=m-l+1;
        int n2=r-m;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[m+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }
            else arr[k++]=arr2[j++];
        }
        if(i==n1){
            while(j!=n2) arr[k++]=arr2[j++];
        }
        if(j==n2){
            while(i!=n1) arr[k++]=arr1[i++];
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,r,m);
        
    }
}
