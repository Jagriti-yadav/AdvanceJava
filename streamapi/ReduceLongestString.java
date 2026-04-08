package streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceLongestString {
  
  public static void main(String[] args){
    List<String> list = Arrays.asList("java","Programming","Stream","API","Functional");
    String result = list.stream().reduce("",(a,b)->a.length()>b.length()?a:b);
    System.out.println(result);
  }

}
