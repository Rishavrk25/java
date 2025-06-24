public class Q21_SpiralMatrix_3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int n = rows*cols;
        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}}; // right, down, left, up
        int res[][]=new int[n][2];
        res[0][0]=rStart;
        res[0][1]=cStart;
        int steps = 1;
        int count = 1;
        int idx=0; // iterate over direction
        while(count < n){
            for(int i=0;i<2;i++){ // repeat two times with same no. of steps
                for(int j=0;j<steps;j++){ // move in one direction at a time
                    rStart+=directions[idx][0];
                    cStart+=directions[idx][1];
                    if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                        res[count][0]=rStart;
                        res[count][1]=cStart;
                        count++;
                    }
                }
                    idx=(idx+1)%4;
            }
                steps++;
        }
        return res;
    }
}
