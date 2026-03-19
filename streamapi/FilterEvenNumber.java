package streamapi;
import java.util.*;
public class FilterEvenNumber {
  public static void main(String[] args){
    List<Integer> data = Arrays.asList(10,15,20,25,30,11,17,16);
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(data);

    //list.stream().filter(n->n%2==0).forEach(value->System.out.println(value));
    
    List<Integer> evenNum = list.stream().filter(n->n%2==0).toList();
    System.out.println(evenNum);

  }
}
