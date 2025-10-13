import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q14_AlienDictionary {
  void bfs(List<List<Integer>> adj, int in[], StringBuilder ans,HashSet<Integer> set){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<in.length;i++) if(in[i]==0 && set.contains(i)) q.add(i);
        while(!q.isEmpty()){
            int u = q.remove();
            ans.append((char)(u +'a'));
            for(int ele : adj.get(u)){
                in[ele]--;
                if(in[ele]==0) q.add(ele);
            }
        }
    }
    
    public String findOrder(String[] words) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<26;i++) adj.add(new ArrayList<>());
        
        int in[] = new int[26];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int j=0;j<s.length();j++){
                set.add(s.charAt(j)-'a');
            }
        }
        
        for(int i=0;i<words.length-1;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            int len = Math.min(s1.length(),s2.length());
            boolean found = false;
            for(int j=0;j<len; j++){
                char ch1 = s1.charAt(j);
                char ch2 = s2.charAt(j);
                if(ch1 != ch2){
                    adj.get(ch1 - 'a').add(ch2 - 'a');
                    in[ch2-'a']++;
                    found=true;
                    break;
                }
            }
            if(!found && s1.length() > s2.length()) return "";
            
        }
        StringBuilder ans = new StringBuilder();
        bfs(adj,in,ans,set);
        if (ans.length() < set.size()) return "";
        return ans.toString();
        
    }
}
