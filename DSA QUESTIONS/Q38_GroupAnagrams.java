import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q38_GroupAnagrams {
     String sort(String s){
        StringBuilder ans=new StringBuilder();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-97;
            arr[idx]++;
        }
        for(int i=0;i<26;i++){
            while(arr[i]-- != 0) ans.append((char)(i+97));
        }
        
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            String s=arr[i];
            s=sort(s);
            if(!map.containsKey(s)) {
                ArrayList<String> list=new ArrayList<>();
                list.add(arr[i]);
                map.put(s,list);
            }
            else{
                ArrayList<String> list = map.get(s);
                list.add(arr[i]);
                map.put(s,list);
            }
        }
        for(String ele : map.keySet()){
            List<String> list=map.get(ele);
            ans.add(list);
        }
       
        return ans;
    }
}
