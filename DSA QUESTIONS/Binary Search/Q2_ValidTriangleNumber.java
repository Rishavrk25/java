import java.util.Arrays;
// leetcode 611
// tc : o(n^2)
// sc : o(1)
// two pointer approach with binary search
// for every largest element c we will find pairs (a,b) such that a+b>c
// we will sort the array first and then fix the largest element and use two pointer approach to find pairs
// if a+b>c then all elements between a and b will also satisfy the condition as array is sorted
public class Q2_ValidTriangleNumber {
  public int triangleNumber(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int ans = 0;
    for (int i = n - 1; i >= 2; i--) {
      int c = arr[i];
      int l = 0;
      int h = i - 1;
      while (l < h) {
        if (arr[l] + arr[h] > c) {
          ans += (h - l);
          h--;
        } else
          l++;
      }
    }
    return ans;
  }
}