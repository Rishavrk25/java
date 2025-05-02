package OOPS.Method_overloading;

class type_promotion
{
public void add(int a){
System.out.println("int argument");
}
public void add(float a){
System.out.println("float argument");
}
}
class Test
{
public static void main(String[] args)
{
    type_promotion c = new type_promotion();
c.add('a');//char----> char,int
c.add(19L);//long----> long,float,double
//CE: no suitable method found
// c.add(10.5);//double -->double
}
}
