package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExtractNameOnly {
  public static void main(String[] args){
    List<String> string = Arrays.asList("10","20","30");
    ArrayList<String> arr = new ArrayList<>();
    arr.addAll(string);
    List<Integer> result = arr.stream().map(x->Integer.parseInt(x)).toList();
    System.out.println(result);
    
  }
}
