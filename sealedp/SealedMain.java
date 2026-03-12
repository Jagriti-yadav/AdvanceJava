package sealedp;

sealed class Shape permits Circle, Rectangle{

}
//The class Circle with a sealed direct supertype Shape should be declared either final, sealed, or non-sealed
//final = no subclass 
final class Circle extends Shape{

}

// sealed class Rectangle extends Shape permits Square{

// }

non-sealed class Rectangle extends Shape{

}

class Quadrilateral{
  
}

//The class Square cannot extend the class Shape as it is not a permitted subtype of Shape
// class Square extends Shape{

// }
public class SealedMain {
  public static void main(String[] args){

  }
}
