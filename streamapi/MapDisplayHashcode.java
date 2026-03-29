package streamapi;
import java.util.*;

public class MapDisplayHashcode {
  public static void main(String[] args){
    List<String> names = Arrays.asList("Java","Python");
    ArrayList<String> list = new ArrayList<>();
    list.addAll(names);
    System.out.println(list);
    List<Integer> hashList = list.stream().map(lang->lang.hashCode()).toList();
    System.out.println(hashList);
  }
}
