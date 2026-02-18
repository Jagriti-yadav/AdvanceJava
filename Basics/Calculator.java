
//variables are the identifier which are used to store the data in the memory location
class Sum{
  int num1 , num2;


  //Constructor overloading


  Sum(){
    //Sum(10,10);   it is not the way to call other constructor inside constructor
    this(10,10);
  }
  
  Sum(int num1,int num2){
    this.num1 = num1;
    this.num2 = num2;
  }


  void getSum(){
    System.out.println("Sum = "+(num1+num2));
  }
}

class Sub{
  void getSub(int num1,int num2){
    System.out.println("subtration - "+(num1-num2));
  }
}
public class Calculator {
  public static void main(String[] args){

    //constructor that is a special method with same name of class and initializes the instance variables , it does not have return type because new keyword creates 

    Sum s1; //object declaration
    s1 = new Sum(4,5); //object instantiation
    s1.getSum();

    new Sum(4,6).getSum();
    //declaring private variable in a class and accessing those variables by getter and setter method , this precess is called encapsulation
  
  }
}
