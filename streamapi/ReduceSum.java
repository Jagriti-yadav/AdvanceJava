package streamapi;
import java.util.*;


public class ReduceSum {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(12,14,54,67,14,97);
    int result = list.stream().reduce(0,(a,b)->a+b);
    System.out.println(result);
  }

  // public static void main(String[] args){
  //   List<Integer> list = Arrays.asList(12,14,54,67,14,97);
  //   int result = list.stream().reduce(0,(a,b)->a+b);
  //   System.out.println(result);
  // }
  
}
