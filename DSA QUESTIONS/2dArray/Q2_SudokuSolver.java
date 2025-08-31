public class Q2_SudokuSolver {
  boolean valid(char board[][],int row,int col,int k){
        for(int i=0;i<9;i++){
            if(board[row][i] == k) return false;
            if(board[i][col] == k) return false;
            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == k) return false;
        }
        return true;
    }
    boolean helper(char board[][]){
        int r = board.length;
        int c= board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(valid(board,i,j,k)){
                            board[i][j] = k;
                            if(helper(board) == true) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        helper(board);
    }
}
