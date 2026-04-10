package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceSquareSum {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(1,2,3,4,5,6);
    int result = list.stream().reduce(0,(a,b)->a+b*b);
    System.out.println(result);
  }
}
