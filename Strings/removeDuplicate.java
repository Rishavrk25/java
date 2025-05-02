import java.util.Scanner;
// You are using Java
class RemoveDuplicatesUtility {
    //type your code here
    public static String removeDuplicates(String str){
        // StringBuilder s=new StringBuilder(str);
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i+1;j<s.length();j++){
    //             if(s.charAt(i)==s.charAt(j)) {
    //                 s.deleteCharAt(j);   
    //                 j--;
    //             }
    //         }
    //     }
    //   String s1=s.toString();
    //     return s1;
    
    boolean visited[]=new boolean[256];
    String s="";
    for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);
        if(!visited[curr]){
            s+=curr;
            visited[curr]=true;
        }
    }
    return s;
    }
}
class removeDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        RemoveDuplicatesUtility obj = new RemoveDuplicatesUtility();
        String result = obj.removeDuplicates(userInput);
        System.out.println(result);

        scanner.close();
    }
}
