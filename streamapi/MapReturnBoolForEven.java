package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapReturnBoolForEven {
  public static void main(String[] args){
    List<Integer> num=Arrays.asList(10,27,30);
    ArrayList<Integer> list= new ArrayList<>();
    list.addAll(num);
    System.out.println(list);
    List<Boolean> evenBool = list.stream().map(n->n%2==0).toList();
    System.out.println(evenBool);

    //if question asked to return 1 for true and 0 for false
    List<Integer> evenNum = list.stream().map(n->n%2==0?1:0).toList();
    System.out.println(evenNum);
  }
}
