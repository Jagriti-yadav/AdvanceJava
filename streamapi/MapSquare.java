package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapSquare {
  public static void main(String[] args){
    List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8);
    ArrayList<Integer> list= new ArrayList<>();
    list.addAll(numbers);
    System.out.println(list);
    List<Integer> sqr = list.stream().map(n->n*n).toList();
    System.out.println(sqr);
  }
}
