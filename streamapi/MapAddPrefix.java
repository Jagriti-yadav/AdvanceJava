package streamapi;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MapAddPrefix {
  
    public static void main(String[] args){
    List<String> name=Arrays.asList("A","B","C");
    ArrayList<String> list= new ArrayList<>();
    list.addAll(name);
    System.out.println(list);
    List<String> prefix = list.stream().map(n->"Item-"+n).toList();
    System.out.println(prefix);
  }

 
}
