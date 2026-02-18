package interfaceExample;

@FunctionalInterface
interface Sub{
  int subtract(int n1,int n2);
}

public class FunctionalInterfaceExample {
  public static void main(String[] args){
    Sub s = new Sub(){
      @Override
      public int subtract(int n1, int n2){
      return n1 - n2;
    }
    };
    int r = s.subtract(100,30);
    System.out.println(r);
    Sub s1 = (int n1, int n2)->n1-n2;
    int r1 = s1.subtract(100,80);
    System.out.println(r1);    
  }
}
