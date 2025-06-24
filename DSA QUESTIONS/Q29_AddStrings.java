public class Q29_AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=0;
            int d1=0,d2=0;
            if(i>=0) d1=num1.charAt(i)-'0';
            if(j>=0) d2=num2.charAt(j)-'0';
            sum+=d1+d2+carry;
            int val=sum%10;
            ans.append((char)(val+'0'));
            carry=sum/10;
            i--;
            j--;
        }
        return ans.reverse().toString();
        
    }
}
