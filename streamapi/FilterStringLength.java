package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringLength {
  public static void main(String[] args){
    List<String> data = Arrays.asList("Amit","Ravi","Vikash","Ashok","Next.js");
    ArrayList<String> list = new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    List<String> name = list.stream().filter(val->val.length()>4).toList();
    System.out.println(name);
  }
}
