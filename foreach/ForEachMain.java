package foreach;
import java.util.*;
import java.util.stream.Collectors;


public class ForEachMain {
  public static void main(String[] args){
    int[] data = new int[]{10,34,15,66,78,45};

    //first method
    // List<Integer> listData = Arrays.stream(data).boxed().toList();

    // second method
    // List<Integer> listData = Arrays.stream(data).boxed().collect(Collectors.toList());

    //third - using for each loop
    List<Integer> listData = Arrays.stream(data).boxed().collect(Collectors.toList());
    // listData.forEach((item)-> System.out.println(item));
    listData.forEach(System.out::println);

    //System.out.println(listData);
  }
  
}
