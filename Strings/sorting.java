import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        String s="Rishav";
        // M-1
        // char[] ch=s.toCharArray();
        // Arrays.sort(ch);
        // for(char ele:ch){
        //     System.out.print(ele);
        // }

        // M-2
        String str[]=s.split("");
        Arrays.sort(str);
        for(String ele:str){
            System.out.print(ele +" ");
        }
    }
}
