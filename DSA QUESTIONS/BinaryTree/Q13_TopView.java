package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import org.w3c.dom.Node;

// 1. Queue is storing a Pair -> node(Node),line(int)
// 2. Map is storing line(int), node.data(int)
public class Q13_TopView {
    class Pair {
        Node node;
        int line;
        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    class Solution {
        ArrayList<Integer> topView(Node root) {
            ArrayList<Integer> res = new ArrayList<>();
            if (root == null)
                return res;
            Queue<Pair> q = new LinkedList<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            // line,node
            q.add(new Pair(root, 0));
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Pair p=q.remove();
                    Node node=p.node;
                    int line=p.line;
                    
                    if(node.left!=null) q.add(new Pair(node.left,line-1));
                    if(node.right!=null) q.add(new Pair(node.right,line+1));

                    if (map.isEmpty() || !map.containsKey(p.line)) // for bottom view remove this line
                        map.put(p.line, p.node.data);
                }
            }
            for (int key : map.keySet()) {
                int val = map.get(key);
                res.add(val);
            }
            return res;
        }
    }
}
