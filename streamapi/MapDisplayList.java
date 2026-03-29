package streamapi;
import java.util.*;
public class MapDisplayList{

  static class Employee {
        int id;
        String name;
        String department;

        // Constructor
        Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        // Optional: toString method for better printing
        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
        }
    }
  public static void main(String[] args){
    
    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee(1,"ankit","cse"));
    list.add(new Employee(12,"rahul","mca"));
    System.out.println(list);
    List<String> empName = list.stream().map(emp->emp.name).toList();
    System.out.println(empName);
  }
  
}
