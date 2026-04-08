package streamapi;

import java.util.*;
import java.util.stream.IntStream;

public class ReduceFactorial {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
    System.out.println(fact);
    sc.close();
  }

}
