package streamapi;
import java.util.*;
import java.util.stream.Collectors;




public class StreamMain {
  public static void main(String[] args){
    List<Integer> data = Arrays.asList(23,34,24,12,37);
  
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.addAll(data);
    System.out.println(list);
    List<Integer> listgt50 = list.stream().filter(n->n>30).collect(Collectors.toList());
    list.stream().filter(n->n>20 && n<30).forEach((value)->System.out.print(value+" "));
    System.out.println();
    System.out.println(listgt50);
  }
  
}
