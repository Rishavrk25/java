public class Q8_XorQueries {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // USING PREFIX SUM -> O(M+N)
        int n=arr.length;
        int m=queries.length;
        int res[]=new int[m];
        for(int i=1;i<n;i++){ // arr -> prefix
            arr[i] = arr[i] ^ arr[i-1];
        }
        for(int i=0;i<m;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            res[i] = l>0 ? (arr[r] ^ arr[l-1]) : arr[r];
        }
        return res;


        // BRUTE FORCE -> O(M*N)
        // int n=arr.length;
        // int r=queries.length;
        // int c=queries[0].length;
        // int res[]=new int[r];
        // for(int i=0;i<r;i++){
        //     int L=queries[i][0];
        //     int R=queries[i][1];
        //     int ans = 0;
        //     for(int j=L;j<=R;j++){
        //         ans^=arr[j];
        //     }
        //     res[i]=ans;
        // }
        // return res;

    }
}
