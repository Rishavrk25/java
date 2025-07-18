public class Q64_BrokenCalculator {
     //RECURSIVE
    // void helper(int s,int t,int c[]){
    //     if(t<=s){
    //         c[0]+=(s-t);
    //         return;
    //     }
    //     c[0]++;
    //     if(t%2==0) helper(s,t/2,c);
    //     else helper(s,t+1,c);
    // }
    // public int brokenCalc(int s, int t) {
    //     int c[]=new int[1];
    //     helper(s,t,c);
    //     return c[0];
    // }

    // ITERATIVE 
    public int brokenCalc(int s, int t) {
        int c=0;
        while(t>s){
            if(t%2==0) t/=2;
            else t+=1;
            c++;
        }
        return c + s - t;
    }
}
