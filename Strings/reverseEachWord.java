public class reverseEachWord {
    public static void main(String[] args) {
        String str="i am rishav kumar";
        String arr[]=str.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++){
            String curr=arr[i];
            StringBuilder sb=new StringBuilder(curr);
            sb.reverse();
            ans+=sb;
            if(i!=arr.length-1) ans+=" ";
        }
        System.out.print(ans);

       
    }
}
