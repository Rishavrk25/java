import java.util.Stack;

public class Q54_StockSpanProblem {
    class Pair{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
class StockSpanner {
    Stack<Pair> st;
    int i;
    public StockSpanner() {
        st=new Stack<>();
        i=0;
    }
   
    public int next(int price) {
        
        int span=0;
        while(!st.isEmpty() && st.peek().val <= price) st.pop();
        if(st.isEmpty()) span=i+1;
        else span=i-st.peek().idx;
        Pair p=new Pair(price,i);
        st.push(p);
        i++;
        return span;
        
        
    }


    // ArrayList<Integer> list;
    // public StockSpanner() {
    //     list=new ArrayList<>();
    // }
   
    // public int next(int price) {
    //     list.add(price);
    //     int c=1;
    //     for(int i=list.size()-2;i>=0;i--){
    //         if(list.get(i)<=price) c++;
    //         else break;
    //     }
    //     return c;
        
    // }
}
}
