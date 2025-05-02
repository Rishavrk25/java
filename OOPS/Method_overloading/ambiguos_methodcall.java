package OOPS.Method_overloading;

class ambiguos_methodcall
{
public void add(int a,float b){
System.out.println("int-float argument");
}
public void add(float a,int b){
System.out.println("float-int argument");
}
}
class Test
{
public static void main(String[] args)
{
    ambiguos_methodcall c = new ambiguos_methodcall();
c.add(10,25.5f);//int,float
c.add(20.5f,10);//float,int
// c.add(10,20);//CE: ambigous method call
}
}
