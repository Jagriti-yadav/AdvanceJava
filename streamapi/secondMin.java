package streamapi;
//print second minimum value
//sort skip findfirst and get
//remove duplicates and find max = distinct and then max

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//find second max element

//print top 3 highest numbers
//sort  reverse limit
public class secondMin {
  public static void main(String[] args){
        List<Integer> list = Arrays.asList(12,14,54,67,14,97);
        List<Integer> topthree = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();

        System.out.println(topthree);


  }
}
