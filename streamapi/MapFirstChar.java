package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapFirstChar {
  public static void main(String[] args){
    List<String> name=Arrays.asList("rahul","ananya","sachin");
    ArrayList<String> list= new ArrayList<>();
    list.addAll(name);
    System.out.println(list);
    List<String> firstChar = list.stream().map(n->n.substring(0,1)).toList();
    System.out.println(firstChar);
  }
}
