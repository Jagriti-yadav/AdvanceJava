package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapStringToLength {
  public static void main(String[] args){
    List<String> name=Arrays.asList("Java","Spring","API");
    ArrayList<String> list= new ArrayList<>();
    list.addAll(name);
    System.out.println(list);
    List<Integer> StrLength = list.stream().map(n->n.length()).toList();
    System.out.println(StrLength);
  }
}
