package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceCountTotalElements {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(12,14,54,67,14,97);
    int result = list.stream().reduce(0,(a,b)->a+1);
    System.out.println(result);
  }
}
