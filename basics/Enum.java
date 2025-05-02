// You are using Java
import java.util.Scanner;
public class Enum{
     enum GameLevel{
            EASY,
            MEDIUM,
            HARD
        }
    public static void main(String[] args){
        GameLevel myvar=null;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0 && n<=50) myvar=GameLevel.EASY;
        else if(n>50 && n<=75) myvar=GameLevel.MEDIUM;
        else if(n>75) myvar=GameLevel.HARD;
        System.out.print(myvar);
    }
}