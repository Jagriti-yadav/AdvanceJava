package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceSumEvenNumber {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(2,4,3,1);
    int result = list.stream().reduce(0,(a,b)->b%2==0?a+b:a);
    System.out.println(result);
  }
}
