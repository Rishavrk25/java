package lpucolab;
import java.util.Scanner;
// You are using Java
class WordEntry {
  //type your code here
  String word;
  WordEntry(String word){
      this.word=word;
  }
 
  public boolean equals(WordEntry obj){
      String str1=this.word.toLowerCase();
      String str2=obj.word.toLowerCase();
      
      String a="";
      String b="";
      for(int i=0;i<str1.length();i++){
          if(str1.charAt(i)!=' ') a+=str1.charAt(i);
      }
      for(int i=0;i<str2.length();i++){
          if(str2.charAt(i)!=' ') b+=str2.charAt(i);
      }
      return a.equals(b);      
  }
}
public class lpucolab2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input1 = scanner.nextLine();
    String input2 = scanner.nextLine();


    WordEntry word1 = new WordEntry(input1);
    WordEntry word2 = new WordEntry(input2);

    if (word1.equals(word2)) {
        System.out.println("Player 2 wins!");
    } else {
        System.out.println("Player 1 wins!");
    }
}
}
