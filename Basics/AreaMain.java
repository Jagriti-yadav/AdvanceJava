abstract class Area{
  int r,l,b;

  // Area(){
  //   System.out.println("This is area constructor");
  // }
  Area(String msg){
    System.out.println(msg);
  }
  void getArea(){
    System.out.println("This is area class");
  }
}

class Circle extends Area{
  final double PI = 3.14;

  //subclass constructor always implicitly calls super class constructor, constructor call jb tk hoga nahi object nahi bnega , jab super class constructor call krayenge to class ka naam super keyword se replace ho jayegi
  Circle(int r){
    super("this is area constructor"); //this should be on first line
    super.r = r;
    
  }
  void getCircleArea(){

    //this also works , when same superclass and subclass have same variable , then super keyword is used to tell that the variable is of super class. and this is used because of law of inheritance , member of superclass is member of subclass.
    // double result = PI*r*r;
    double result = PI*super.r*this.r; //this = pahle same class me search krta h fir super class me(and takes time) , but it fails in testing,"super" keyword will not get failed in testing, because it will directly check the super class variable.
    //instance variable ko initialize constructor se krte h

    System.out.println("Area of Circle = "+result);
  }
}
public class AreaMain {
  public static void main(String[] args){
    Circle c = new Circle(12);
    c.getArea();
  
    // Area a  = new Circle(20); //upcasting , polymorphism shows that subclass circle has area class address, thats why this process is possible
    //why this is possible? child class reference passed to super class object.
    // a.getArea();

    //downcasting is not possible in java 
    //downcasting super class area does not have its subclass constructor address , so this returns some garbage and jvm does not detect the address.
    // Circle c = (Circle) new Area("abc"); 
    // c.getArea();
    // c.getCircleArea();
  }
  
  
}

//abstract class is a incomplete class and it cant get reference in memory aur object of these class cant create , because subclass methods will override it , .
//abstract and interface = object can be created but cant instantiated , only object declaration is done not initialization.
//in abstract class in java , it can be possible that it does not have abstract method, but in c atleast one method should be abstract.
//if there is any abstract method in class , then class must have to be abstract, and then that abstract method must override in subclass. 