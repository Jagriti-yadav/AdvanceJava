package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterGreaterLessThanNumber {
  public static void main(String[] args){
    List<Integer> data = Arrays.asList(10,60,45,30,24,50,76);
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    
    List<Integer> num = list.stream().filter(val->val>=50&&val<=60).toList();
    System.out.println(num);
  }
}
