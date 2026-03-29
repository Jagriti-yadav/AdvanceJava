package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDoubleValue {
  public static void main(String[] args){
    List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8);
    ArrayList<Integer> list= new ArrayList<>();
    list.addAll(numbers);
    System.out.println(list);
    List<Integer> doubleValue = list.stream().map(n->n*2).toList();
    System.out.println(doubleValue);
  }
}
