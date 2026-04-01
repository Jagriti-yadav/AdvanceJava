package streamapi;

import java.util.*;


public class MapGraceMarks {
  public static void main(String[] args){
    List<Integer> marks=Arrays.asList(10,20,30,40,50,60,70,80);
    ArrayList<Integer> list= new ArrayList<>();
    list.addAll(marks);
    System.out.println(list);
    List<Integer> grace5 = list.stream().filter(m->m<40).map(mark->mark+5).toList();
    System.out.println(grace5);
  }
}
