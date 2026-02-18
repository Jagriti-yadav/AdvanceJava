package interfaceExample;
//public static final = variables inside interface
//public static abstract = methods inside interface
interface Message  {
  void displayMsg();
  default void displayMsg(String msg){
    System.out.println("this is parent class method");
  }
  
  
}
class DisplayMessage implements Message{
  @Override
  public void displayMsg(){
    System.out.println("this is child class method");
  }
  @Override
  public void displayMsg(String msg){
    System.out.println("this is child 2 class method");
  }
  private void displayInfo(){
    System.out.println("this is private");
  }

}
public class MainInterface {
  public static void main(String[] args){
    DisplayMessage dm = new DisplayMessage();
    dm.displayMsg();
    dm.displayMsg("This is second method");
   
  }
}
