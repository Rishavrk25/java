import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q59_GenerateBinaryNumbers {
   static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        Queue<String> q=new LinkedList<>(); 
        q.add("1");
        for(int i=0;i<n;i++){
            String str=q.remove();
            ans.add(str);
            q.add(str+"0");
            q.add(str+"1");
        }
        return ans;
    } 
}
