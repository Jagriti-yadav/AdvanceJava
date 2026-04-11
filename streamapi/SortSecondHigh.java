package streamapi;
import java.util.*;

public class SortSecondHigh {
  public static void main(String[] args){
    //find second highest number
    // List<Integer> list = Arrays.asList(12,23,11,34);
    // int result = list.stream().sorted((a,b)->b-a).toList().get(1);
    // System.out.println(result);


    //Find Second highest number
    // List<Integer> list = Arrays.asList(12,23,11,34);
    // int result = list.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
    // System.out.println(result);


    //print alphabetically sorted list
    // List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
    // List<String> result = list.stream().sorted().toList();
    // System.out.println(result);

    //aplhabetically sorted
    // List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
    // List<String> result = list.stream().sorted((a,b)->a.compareTo(b)).toList();
    // System.out.println(result);


    //reverse order alphabetically
    // List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
    // List<String> result = list.stream().sorted(Comparator.reverseOrder()).toList();
    // System.out.println(result);

    //reverse order aiphabeticaly 
    List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
    List<String> result = list.stream().sorted((a,b)->b.compareTo(a)).toList();
    System.out.println(result);
  }
}
