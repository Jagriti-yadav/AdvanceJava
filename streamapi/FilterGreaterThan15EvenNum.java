package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterGreaterThan15EvenNum {
  public static void main(String[] args){
    List<Integer> data = Arrays.asList(10,60,45,30,8,50,76);
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    

    //can be solved using (val-> val>15&&val%2==0)
    //but better to use two filters
    List<Integer> num = list.stream().filter(val->val%2==0).filter(n->n>15).toList();
    System.out.println(num);
  }
}
