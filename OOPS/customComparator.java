import java.util.Arrays;
class Student implements Comparable<Student>{
  int rno;
  double perc;
  String name;

  Student(int rno, double perc, String name) {
    this.name = name;
    this.rno = rno;
    this.perc = perc;
  }
  public int compareTo(Student s){
    return (int) (this.perc - s.perc);
    // return this.rno - s.rno;
    // return this.name.charAt(0) - s.name.charAt(0);
  }
}
public class customComparator {
  public static void print(Student[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i].name+" ");
      System.out.print(arr[i].perc+" ");
      System.out.print(arr[i].rno+" ");
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Student[] s=new Student[4];
    s[0]= new Student(76, 89,"Raghav");
    s[1]= new Student(75, 54,"Rishav");
    s[2]= new Student(72, 90,"rk");
    s[3]= new Student(34, 76,"ss");
    // print(s);
    Arrays.sort(s);
    print(s);
  }
}
