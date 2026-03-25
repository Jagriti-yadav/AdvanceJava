package streamapi;
import java.util.*;
import java.util.ArrayList;

//create a class Student(name,marks) to filter name of students having marks greater than 60
//remember = you have to create a variable "id" to access details
class Student{
  int id;
  String name;
  int marks;
  Student(int id,String name,int marks){
    this.id = id;
    this.name=name;
    this.marks=marks;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }
  @Override
  public String toString(){
    return "Student [sid=" +id+ ",name=" +name+ ",marks=" +marks+ "]";
  }

  

}
public class FilterStudentsMarks {
  public static void main(String[] args){
    
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(01,"amit",70));
    list.add(new Student(02,"Ananya",55));
    list.add(new Student(03,"Anita",65));
    List<Student> greaterThan60 = list.stream().filter(student->student.getMarks()>60).toList();
    greaterThan60.forEach(System.out::println);
  }
}


