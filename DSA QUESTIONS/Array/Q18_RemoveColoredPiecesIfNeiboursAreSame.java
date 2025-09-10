package Array;
public class Q18_RemoveColoredPiecesIfNeiboursAreSame {
    public boolean winnerOfGame(String s) {
        int movesA=0;
        int movesB=0;
        int a=0;
        int b=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                a++;
                if(b>=3) movesB+=b-2;
                b=0;
            }
            else if(s.charAt(i)=='B'){
                b++;
                if(a>=3) movesA+=a-2;
                a=0;
            }
        }
        if(a>=3) movesA+=a-2;
        if(b>=3) movesB+=b-2;
        return movesA>movesB;
    }
}