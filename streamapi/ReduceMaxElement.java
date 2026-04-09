package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceMaxElement {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(12,14,54,67,14,97);
    int result = list.stream().reduce(1,(a,b)->a>b?a:b);
    System.out.println(result);
  }
}
