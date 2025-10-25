package Sorting;

public class MergeSort {
    // Tc: O(n log n) in all cases
    // Sc: O(n)
    void merge(int arr[], int arr1[], int arr2[], int n1, int n2) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j])
                arr[k++] = arr1[i++];
            else
                arr[k++] = arr2[j++];
        }

        while (j < n2)
            arr[k++] = arr2[j++];
        while (i < n1)
            arr[k++] = arr1[i++];

        arr1 = null;
        arr2 = null;
    }

    void mergeSort(int arr[], int l, int r) {
        if (l >= r)
            return;
        int m = (l + r) / 2;

        int n1 = m - l + 1;
        int n2 = r - m;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[m + i + 1];
        }

        mergeSort(arr1, 0, n1 - 1);
        mergeSort(arr2, 0, n2 - 1);
        merge(arr, arr1, arr2, n1, n2);

    }
}