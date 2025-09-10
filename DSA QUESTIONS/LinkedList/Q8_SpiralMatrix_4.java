package LinkedList;

public class Q8_SpiralMatrix_4 {
    public int[][] spiralMatrix(int r, int c, ListNode head) {
        int res[][]= new int[r][c];
        int left=0;
        int top=0;
        int right = c-1;
        int bottom = r-1;
        ListNode temp=head;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=-1;
            }
        }
        while(temp!=null){
            for(int i=left;i<=right && temp!=null;i++){
                    res[top][i]=temp.val;
                    temp=temp.next;
               
            }
            top++;
            for(int i=top;i<=bottom  && temp!=null;i++){
                
                    res[i][right]=temp.val;
                    temp=temp.next;
               
            }
            right--;
            for(int i=right;i>=left  && temp!=null;i--){
                
                    res[bottom][i]=temp.val;
                    temp=temp.next;
             
            }
            bottom--;
            for(int i=bottom;i>=top  && temp!=null;i--){
               
                    res[i][left]=temp.val;
                    temp=temp.next;
             
            }
            left++;
        }
        return res;
    }
}
