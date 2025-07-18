public class Q66_BreakPalindrome {
    public String breakPalindrome(String s) {
        // we need to break a palindrome and return the lexicographically smallest string
        // 1. traverse to half of the string
        // 2. traverse through each character, if ch!='a' then set ch='a'
        // 3. if all 'a' then set last character to 'b'
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
        if(n==1) return "";
        for(int i=0;i<n/2;i++){
            char ch=sb.charAt(i);
            if(ch!='a'){
                sb.setCharAt(i,'a');
                return sb.toString();
            }
        }
            sb.setCharAt(n-1,'b');
            return sb.toString();
           
    }
}
