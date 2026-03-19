package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDistinctGreaterNum {
  public static void main(String[] args){
    List<Integer> data = Arrays.asList(10,20,20,30,30);
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(data);

    //list.stream().filter(n->n%2==0).forEach(value->System.out.println(value));
    
    //remember to use distinct after filter , this will save a lot of time to search unique elements after filtering numbers.
    List<Integer> evenNum = list.stream().filter(n->n>15).distinct().toList();
    System.out.println(evenNum);

  }
}
