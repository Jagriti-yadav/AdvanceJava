package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringContainsO {
  public static void main(String[] args){
    List<String> data = Arrays.asList("Java","Python","Go","Ruby");
    ArrayList<String> list = new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    List<String> name = list.stream().filter(val->val.contains("o")).toList();
    System.out.println(name);
  }
}
