package streamapi;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;
//comparator as a parameter
//max = length - 1
//min - 0
public class MinMax {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(23,23,12,3,5,25,78);

    //0th index return by min
    // Optional<Integer> result = list.stream().min((a,b)->b-a);
    Optional<Integer> result = list.stream().min((a,b)->a-b);

    //last index value return by max
    // Optional<Integer> result = list.stream().max((a,b)->b-a);
    // Optional<Integer> result = list.stream().max((a,b)->a-b);

    result.ifPresent(System.out::println);
  }
}
