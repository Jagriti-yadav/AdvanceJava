package lambda;
@FunctionalInterface
interface Calc{
  void add(int n1,int n2);
}
public class MainLambda{
  public static void main(String[] args){
    Calc sum = (int n1, int n2)->{
    System.out.print("sum = ");
    System.out.println((n1+n2));
  };
  sum.add(30,40);
  
  Calc sum1 = (int n1, int n2)-> System.out.println((n1+n2));
  sum1.add(20,14);
  }
  
}



