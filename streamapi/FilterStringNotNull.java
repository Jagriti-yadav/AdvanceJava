package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringNotNull {
  public static void main(String[] args){
  List<String> data = Arrays.asList("Java",null,"Spring",null,"react");
    ArrayList<String> list = new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    List<String> name = list.stream().filter(val->val!=null).toList();
    System.out.println(name);
  }
}
