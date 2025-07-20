package Array;
public class Q2_Sort0s1sAnd2s {

  // 1. Using Buildin sort
  //   TC = O(nlogn)
  //   SC = O(logn) / O(n)


  // 2. Counting 0s,1s and 2s - two pass
  //   TC = O(n)
  //   SC = O(1)
  

  // 3. Dutch National Flag Algorithm - one pass (OPTIMAL)
  //   TC = O(n)
  //   SC = O(1)

  void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public void sort012(int[] arr) {
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    int mid = 0;
    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        low++;
        mid++;
      } else if (arr[mid] == 1)
        mid++;
      else if (arr[mid] == 2) {
        swap(arr, mid, high);
        high--;
      }
    }
  }
}
