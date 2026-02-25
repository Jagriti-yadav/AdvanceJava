package lambda;
@FunctionalInterface
  interface Square{
    int getSquare(int n);
  }


public class SquareMain {
  public static void main(String[] args){
    Square sqr = (int n)->n*n;
    System.out.println(sqr.getSquare(4));
  }
}
