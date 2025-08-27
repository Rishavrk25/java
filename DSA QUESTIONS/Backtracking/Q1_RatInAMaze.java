package Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Q1_RatInAMaze {
  //  void helper(int i,int j,int maze[][],boolean visited[][],String s,ArrayList<String> ans){
  //       int n=maze.length;
  //       if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || visited[i][j]){
  //           return;
  //       }
  //       if(i==n-1 && j==n-1){
  //           ans.add(s);
  //           return;
  //       }
  //       visited[i][j]=true;
  //       // calling in lexicographically order
  //       helper(i+1,j,maze,visited,s+'D',ans); // down
  //       helper(i,j-1,maze,visited,s+'L',ans); // left
  //       helper(i,j+1,maze,visited,s+'R',ans); // right
  //       helper(i-1,j,maze,visited,s+'U',ans); // up
  //       visited[i][j]=false; // backtrack
  //   }
  //   public ArrayList<String> ratInMaze(int[][] maze) {
  //       int n=maze.length;
  //       ArrayList<String> ans=new ArrayList<>();
  //       boolean visited[][]=new boolean[n][n];
  //       helper(0,0,maze,visited,"",ans);
  //       return ans;
  //   }


  // OPTIMIZED
  void helper(int i,int j,int maze[][],boolean visited[][],String s,ArrayList<String> ans,int di[],int dj[]){
        int n=maze.length;
        if(i==n-1 && j==n-1){
            ans.add(s);
            return;
        }
        String dir="DLRU";
        visited[i][j]=true;
        for(int idx=0;idx<4;idx++){
            int nexti=i+di[idx];
            int nextj=j+dj[idx];
            if(nexti<0 || nexti>=n || nextj<0 || nextj>=n || maze[nexti][nextj]==0 || visited[nexti][nextj]){
                continue;
            }
            helper(nexti,nextj,maze,visited,s+dir.charAt(idx),ans,di,dj);
        }
        visited[i][j]=false;
       
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n=maze.length;
        ArrayList<String> ans=new ArrayList<>();
        boolean visited[][]=new boolean[n][n];
        int di[]={1,0,0,-1};
        int dj[]={0,-1,1,0};
        helper(0,0,maze,visited,"",ans,di,dj);
        return ans;
    }
}