package methodreferencing;

class Circle{
  Circle(){
    System.out.println("Constructor of class");
  }
  Circle(String msg){
    System.out.println("this is (inside class) parameterized connstructor");
  }
  static double area(int r){
    return Math.PI*r*r;
  }
}

@FunctionalInterface
interface CircleInfo{
  void getInfo(String msg);
}

@FunctionalInterface
interface Area{
  double getArea(int num);
}

public class MainMethodRef {
  public static void main(String[] args){
//   Circle c = new Circle();

//method referencing = passing reference of area to "Area" functional interface having same signature method (getArea)
//(::) = method referencing symbol
//condition signature must be same. (return type , no. of parameters and datatypes)

//method referencing in case of instance method.
//Area ca = c::area; 

//is method referencing only done with instance methods? //use static keyword before this method "static double area(int r)" = to class ke naam se access hoga 

//constructor hmesha void ayega
    Area ca = Circle::area;
    System.out.println("Area = " + ca.getArea(5));

    CircleInfo ci = Circle::new;
    ci.getInfo("This is parameterized constructor");
  }
}
