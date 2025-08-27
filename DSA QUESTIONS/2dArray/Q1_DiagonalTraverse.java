public class Q1_DiagonalTraverse {
  public int[] findDiagonalOrder(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int res[]=new int[r*c];
        int k=0;
        int i=0;
        int j=0;
        boolean up = true;
        while(i<r && j<c){
            if(up){
                while(i>0 && j<c-1){
                    res[k++] = arr[i][j];
                    i--;
                    j++;
                }
                res[k++] = arr[i][j];
                if(j==c-1) i++;
                else j++;
                up = !up;
            }
            else{
                while(j>0 && i<r-1){
                    res[k++] = arr[i][j];
                    i++;
                    j--;
                }
                res[k++] = arr[i][j];
                if(i==r-1) j++;
                else i++;
                up = !up;
            }
        }
        return res;
    }
}
