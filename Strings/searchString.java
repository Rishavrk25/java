public class searchString {
    public static void main(String[] args) {
   
        String s="The quick brown fox";
        String toFind="fox";
        // boolean flag=false;
        // for(int i=0;i<=s.length()-toFind.length();i++){
        //     String substr=s.substring(i,i+toFind.length());
        //     if(substr.equals(toFind)) flag=true;
        // }
        // if(flag) System.out.printf("Found Substring: %s",toFind);
        // else System.out.printf("Substring not found");
        System.out.println(s.contains(toFind));
    }
}
