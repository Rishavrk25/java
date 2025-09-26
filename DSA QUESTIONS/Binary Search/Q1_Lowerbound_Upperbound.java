public class Q1_Lowerbound_Upperbound {
  int lowerBound(int arr[], int t) {
    int n = arr.length;
    int l = 0, h = n;
    while (l < h) {
        int m = l + (h - l) / 2;
        if (arr[m] < t) {
            l = m + 1;
        } else {
            h = m;
        }
    }
    return l; // index of first element >= t, or n if none
}

int upperBound(int arr[], int t) {
    int n = arr.length;
    int l = 0, h = n;
    while (l < h) {
        int m = l + (h - l) / 2;
        if (arr[m] <= t) {
            l = m + 1;
        } else {
            h = m;
        }
    }
    return l; // index of first element > t, or n if none
}

}