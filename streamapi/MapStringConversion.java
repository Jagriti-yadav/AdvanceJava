package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapStringConversion {
  public static void main(String[] args){
    List<Integer> num=Arrays.asList(10,20,30);
    ArrayList<Integer> list= new ArrayList<>();
    list.addAll(num);
    System.out.println(list);
    List<String> str = list.stream().map(n->n.toString()).toList();
    System.out.println(str);
  }
}
