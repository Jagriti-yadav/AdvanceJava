package foreach;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerMain {
  public static void main(String[] args){

    /*  
      Arrays.asList() - This method converts values into a fixed-size List.
        This list is fixed size.
        That means:
        Cannot add element
        Cannot remove element 
    */
    List<Integer> nums = Arrays.asList(1,4,3,5,6,2,8);

    //forEach = takes object of consumer interface
    //Consumer = is a functional interface(for which lambda expression is applicable) , belong to java.util.function package , has only one method (accept method)


    //interfaces can not be instantiated (cannot created directly)
    //method to create Consumer object

    //1.using lambda expression

    //2.using anonymous class
    Consumer<Integer> con = new Consumer<Integer>(){
      public void accept(Integer x){
        System.out.println(x);
      }
    };
    nums.forEach(con);
    
    
  }
}
