public class maxInt {
    public static String maxS(String a,String b){
        String a1="";
        String b1="";
        boolean bool1=false;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch!='0') bool1=true;
            if(bool1) a1+=ch;
        }
        boolean bool2=false;
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if(ch!='0') bool2=true;
            if(bool2) b1+=ch;
        }
        if(a1.length()!=b1.length()){
            if(a1.length()>b1.length()) return a;
            else return b;
        }
   
        else{
            for(int i=0;i<a1.length();i++){
                if(a1.charAt(i)>b1.charAt(i)) return a;
                else if(a1.charAt(i)>b1.charAt(i)) return b;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String mx="";
        String arr[]={"999","1018","0078"};
        for(int i=0;i<arr.length;i++){
            String s1=arr[i];
            mx=maxS(mx,s1);
        }
        System.out.println(mx);
    }
}
