package varp;
//generic = specific datatype

import java.util.ArrayList;
import java.util.HashMap;

public class VarPractice {
  public static void main(String[] args){
    // var list = new ArrayList<>(); = any data will get stored hence it must specify what kind of data is to stored
    
    var list = new ArrayList<Integer>();
    var map = new HashMap<Integer, String>();
    var number = 20;

        list.add(10);
        map.put(1, "Hello");

        System.out.println(list);
        System.out.println(map);
        System.out.println(number);
  }
}
