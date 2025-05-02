package OOPS;
import java.util.Scanner;
// You are using Java
class Person {
    //type your code here
    String name;
    int age;
    double height;
    double weight;
    Person(String n, int a, double h, double w){
       name=n;
       age=a;
       height=h;
       weight=w;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+" years");
        System.out.printf("Height: %.2f meters\n",height);
        System.out.printf("Weight: %.2f kilograms\n",weight);
        System.out.printf("BMI: %.2f\n",weight/(height*height));
    }
}

class Athlete extends Person {
    //type your code here
    int exercise;
    double calorie;
    Athlete(String n,int a, double h, double w, int e, double c){
        super(n,a,h,w);
        exercise=e;
        calorie=c;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+" years");
        System.out.printf("Height: %.2f meters\n",height);
        System.out.printf("Weight: %.2f kilograms\n",weight);
        System.out.printf("BMI: %.2f\n",weight/(height*height));
        
        System.out.printf("Exercises per day: %d\n",exercise);
        System.out.printf("Calories burned per exercise: %.2f calories\n",calorie);
        System.out.printf("Total Calories Burned: %.2f calories",exercise*calorie);
    }
}
class inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String personName = scanner.nextLine();
        int personAge = scanner.nextInt();
        double personHeight = scanner.nextDouble();
        double personWeight = scanner.nextDouble();
        Person person = new Person(personName, personAge, personHeight, personWeight);
        
        scanner.nextLine();
        String athleteName = scanner.nextLine();
        int athleteAge = scanner.nextInt();
        double athleteHeight = scanner.nextDouble();
        double athleteWeight = scanner.nextDouble();
        int exercisesPerDay = scanner.nextInt();
        double caloriesBurnedPerExercise = scanner.nextDouble();
        
        Athlete athlete = new Athlete(athleteName, athleteAge, athleteHeight, athleteWeight, exercisesPerDay, caloriesBurnedPerExercise);
        
        System.out.println("Information for the regular person:");
        person.displayInfo();
        System.out.println("\nInformation for the athlete:");
        athlete.displayInfo();
        
        scanner.close();
    }
}
