package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNameStartWithA {
  public static void main(String[] args){
    List<String> data = Arrays.asList("Amit","Ravi","Vikash","Ashok","Rahul");
    ArrayList<String> list = new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    //list.stream().filter(n->n%2==0).forEach(value->System.out.println(value));
    
    // List<String> name = list.stream().filter(val->val.charAt(0)==65).toList();
    List<String> name = list.stream().filter(val->val.startsWith("A")).toList();
    System.out.println(name);
  }
}
