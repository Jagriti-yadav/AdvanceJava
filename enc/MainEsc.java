package enc;
import java.util.*;
//bydefault all classes have object as parent class (all classes are subclasses of object (parent class))
class Product{
  private int pid;
  private String productName;
  private double price;
  private int quantity;

  public Product(int pid, String productName,double price,int quantity){
    this.pid = pid;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public String getProductName() {
    return productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
}
public class MainEsc{
  public static void main(String[] args){

    //STORES PRODUCT OBJECT IN ARRAYLIST
    ArrayList<Product> list = new ArrayList<>();
    // Product p1 = new Product(1,"mobile",20000,01);
    // list.add(p1);
    //anonymous object
    list.add(new Product(1,"mobile",20000,01));
    list.add(new Product(2,"mobile",20000,02));
    list.add(new Product(3,"mobile",20000,03));
    list.add(new Product(4,"mobile",20000,04));
    list.add(new Product(5,"mobile",20000,05));
    System.out.println("Product Id\tProduct Name\tProduct Price\tProduct Quantity");
    for(Product p:list){
      String result = String.format("\t%d\t%s\t\t%f\t%d",p.getPid(),p.getProductName(),p.getPrice(),p.getQuantity());
      System.out.println(result);
    }


    //why oop consider beneficial for large scale software developement
    //real life entity through object oriented programming

    //class is a blueprint for any object and object is an instance of class
    //method declared inside a class , not delcared as static = instance method
    //variable declared inside a class but outside the method = instance variable
    //static method is known as class method

    //when should you use static keyword = when no object is created
    //when you want to share same data to all instance(object) of that class, and when any object changes the data ,  it should reflect to all other objects.
    //sharing common value to all object and modification by one object reflect to others too

    //use of this and super 
    //this = this object ke current instance
    //super =  parent class ke current instance

    //static variable 
    //class constructor call - variable initialize as 0 each time  , static variable will change if one of the object change that variable and second object calls that variable

    //constructor
    //a special method , which is created with same name as class name
    //it does not have return type
    //calls when object is created
    //constructor chaining -calling constructor inside constructor

    //inheritance 
    //overloading and overriding

    //access modifier
    //top class should be public 
    //inside classes can be public, protected , ....

    //encapsulation
    //



}
}
