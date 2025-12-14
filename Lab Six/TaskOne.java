public class Main
{ 
    public static void main(String[] args) 
    { 
        Son son = new Son();
        son.company(); 
        son.car(); 
        son.ownProperty();
    }
}
class Grandfather 
{
     void company() 
     {
System.out.println("Grandfather's company: Bonoful Sweets");
}
}
class Father extends Grandfather 
{
     void car() 
     {
          System.out.println("Father's car: Toyota");
     }
}
class Son extends Father 
{
     void ownProperty() 
     {
          System.out.println("Son's property: Bicycle");
     }
}


