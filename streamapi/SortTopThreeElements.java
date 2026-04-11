package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortTopThreeElements {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(1,2,6,3,4);
    List<Integer> topThree = list.stream()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .toList(); // Java 16+
    System.out.println(topThree);
  }
}
