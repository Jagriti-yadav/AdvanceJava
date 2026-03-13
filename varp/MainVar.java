package varp;
class Message{
  void getMessage(){
    System.out.println("this called by var");
  }
}

//java10 = can use var variable to intitalize a variable
//local variables can be decared as var not instance variable(instance variable cannot be initialize as var)
public class MainVar {
  public static void main(String[] args){

    //can't initialize a variable if var keywrod is used. 
    // var s1;
    //LOCAL VARIABLE TYPE REFERENCE

    //if a variable initialize as var , the datatype can't be changed.
    //string is stored in var datatype.
    // var r = "hello";

    
    //String msg = "this is line 1\n this is line 2\n" + "this is line 3\n this is line 4";
    //shortcut to write this line is given below

    //TEXT BLOCK
    //introduced in JAVA 15 , confirmed in JAVA 17
    String msg = """
        this is line 1
        this is line 2
        this is line 3
        """;
    System.out.println(msg);
    



    
  }
}
