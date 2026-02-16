package abstractArea;
//abstraction = inheritance + polymorphism 
abstract class Area{
  abstract void getArea();
}


//blueprint for classes = interface


//abstract class extend to another class and you have not solution then make that class abstract , if you have solution in that subclass then override the abstract method , (then you dont have to add abstract keyword)
//1.
// abstract class Rectangle extends Area{

// }

//2.
class Rectangle extends Area{
int l,b;
Rectangle(int l , int b){
  this.l = l;
  this.b = b;
}
  @Override
  void getArea() {
    int r = l * b;
    System.out.println("Area of rectangle is = "+r);
  }
  void displayResult(){
    System.out.println("This is display function in Rectangle class");
  }
  
}
public class MainArea {
  public static void main(String[] args){
    Rectangle r1 = new Rectangle(10,20);
    r1.getArea();
    r1.displayResult();
    //Area r2; //object creation of abstract class
    //r2 = new Rectangle(2, 3);//can't instantiate the abstract class therefore passing the reference of subclass in superclass(abstract class Area) (this mechanism is called as upcasting).this is the concept of polymorphism that allows upcasting.

    //Java does not support Downcasting

    Area r2 = new Rectangle(10,20);
    r2.getArea();

    //Anonymous class
    //shortcut of inheritance
    Area circle = new Area(){
      int r3 = 1;

      @Override
      void getArea() {
        
        double result = 3.14*r3*r3;
        System.out.println(result);
      }
      
    };
    circle.getArea();

  }

}
