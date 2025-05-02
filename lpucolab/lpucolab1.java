package lpucolab;
import java.util.Scanner;
// You are using Java
abstract class GameCharacter {
  //Type your code here
  public abstract void attack(int a);
  public abstract void defend(int b);
  
}

class Warrior extends GameCharacter {
  //Type your code here
  @Override
  public void attack(int a){
      System.out.printf("Attack: Powerful sword slash for %d damage!\n",a*3);
  }
  @Override
  public void defend(int b){
      System.out.printf("Defend: Raises shield, defence boosted by %d!\n",b);
      
  }
}

class Wizard extends GameCharacter {
  //Type your code here
  @Override
  public void attack(int a){
      
      System.out.printf("Attack: Casts spell, deals %d magical damage!\n",a*2);
  }
  @Override
  public void defend(int b){
      System.out.printf("Defend: Creates magical barrier, defence boosted by %d!",b);
      
  }
  
}
public class lpucolab1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    int attributeValue = scanner.nextInt();
    GameCharacter character;
    if (choice == 1) {
        character = new Warrior();
    } else if (choice == 2) {
        character = new Wizard();
    } else {
        System.out.println("Invalid choice");
        return;
    }

    System.out.println((choice == 1 ? "Warrior" : "Wizard") + " Actions:");
     character.attack(attributeValue);
    character.defend(attributeValue);

    scanner.close();
}
}
