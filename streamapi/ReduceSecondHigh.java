package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceSecondHigh {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(12,14,54,67,14,97);
    int max = list.stream().reduce(1,(a,b)->a>b?a:b);
    int result = list.stream().reduce(1,(a,b)->(a>b && a<max)?a:b);
    System.out.println(result);
  }
}
