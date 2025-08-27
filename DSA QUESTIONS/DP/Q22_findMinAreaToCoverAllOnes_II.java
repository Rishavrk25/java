package DP;

public class Q22_findMinAreaToCoverAllOnes_II {
  int minArea(int rStart,int rEnd,int cStart,int cEnd,int arr[][]){
        int xMin=1000, xMax=0, yMin = 1000, yMax=0;
        for(int i=rStart;i<rEnd;i++){
            for(int j=cStart;j<cEnd;j++){
                if(arr[i][j]==1){
                    xMin = Math.min(xMin, i);
                    xMax = Math.max(xMax, i);
                    yMin = Math.min(yMin, j);
                    yMax = Math.max(yMax, j);
                }
            }
        }
        int area = (xMax-xMin+1) * (yMax-yMin+1);
        return area;
    }
    int helper(int arr[][]){
        int ans = Integer.MAX_VALUE;
        int r=arr.length;
        int c=arr[0].length;
        for(int rowSplit=1;rowSplit<r;rowSplit++){
            for(int colSplit=1;colSplit<c;colSplit++){
                // CASE 1
                // -------TOP---------
                // TOPLEFT | TOPRIGHT
                int top = minArea(0,rowSplit,0,c,arr);
                int topleft = minArea(rowSplit, r,0,colSplit,arr);
                int topright= minArea(rowSplit,r,colSplit,c,arr);
                ans= Math.min(ans,top + topleft + topright);
                // CASE 2
                // BOTTOMLEFT | BOTTOMRIGHT
                // --------BOTTOM----------
                int bottomleft = minArea(0,rowSplit,0,colSplit,arr);
                int bottomright = minArea(0,rowSplit,colSplit,c,arr);
                int bottom = minArea(rowSplit,r,0,c,arr);
                ans=Math.min(ans, bottomleft + bottomright + bottom); 
            }
        }
        // CASE 3
        // -------TOP -------
        // ------MIDDLE------
        // ------BOTTOM------
        for(int rowsplit1 = 1;rowsplit1<r ;rowsplit1++){
            for(int rowsplit2 =rowsplit1 + 1 ; rowsplit2<r;rowsplit2++){
                int top = minArea(0,rowsplit1,0,c,arr);
                int middle = minArea(rowsplit1,rowsplit2,0,c,arr);
                int bottom =minArea(rowsplit2,r,0,c,arr);
                ans=Math.min(ans,top+middle+bottom);
            }
        }
        return ans;
    }
    void rotate(int arr[][],int newArr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newArr[j][r-i-1] = arr[i][j];
            }
        }
    }
    public int minimumSum(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int ans = helper(arr);
        int newArr[][] = new int[c][r];
        rotate(arr,newArr);
        ans = Math.min(ans,helper(newArr));
        return ans;
    }
}
