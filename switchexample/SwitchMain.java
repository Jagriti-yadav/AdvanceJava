package switchexample;

//modular programming ? - which not full fledge in itself but can be used anywhere

//when we have multiple choice for one variable
//difference between statement and expression
//statement = may or may not return value 
//expression = returns value and it is a part of statement

//switch expression = normal switch does not return value, but this returns some kind of value after each case


public class SwitchMain {
  public static void main(String[] args){
    int day = 1;
    String result = switch(day){
      case 1,3,5->{
        System.out.println("this is 1 and 7");
        yield "Monday";
      }
    case 2,4,6->"Tuesday";
    default-> "No day";
    };
    System.out.println(result);
  }
}
