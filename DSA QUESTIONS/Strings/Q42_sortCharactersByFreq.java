package Strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        if(this.freq == p.freq) return p.ch - this.ch;
        return this.freq - p.freq;
    }
}
class Q42_sortCharactersByFreq{
    public static String sortByFrequency(int n, String s) {
        // Write Your Code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else{
                int val=map.get(ch);
                map.put(ch,val+1);
            }
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            Pair p = new Pair(ch,freq);
            pq.add(p);
        }
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            for (int i = 0; i < p.freq; i++) {
                ans.append(p.ch);
            }
    }
    return ans.toString();
}
}