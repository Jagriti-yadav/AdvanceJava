package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapUpperCase {
  public static void main(String[] args){
    List<String> lowerCase=Arrays.asList("rahul","ananya","sachin");
    ArrayList<String> name= new ArrayList<>();
    name.addAll(lowerCase);
    System.out.println(name);
    List<String> upperCase = name.stream().map(mark->mark.toUpperCase()).toList();
    System.out.println(upperCase);
  }
}
