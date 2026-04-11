package streamapi;
import java.util.*;
public class SortExample {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(1,2,6,3,4);
    List<Integer> sortedlist = list.stream().sorted().toList();
    System.out.println(sortedlist);
  }
}
