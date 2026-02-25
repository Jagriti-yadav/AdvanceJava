package lambda;
//string is immutable hence it does not have reverse or other methods
//

@FunctionalInterface

interface PalinString{
  boolean checkPalin(String s);
}
public class Palindrome{
  public static void main(String[] args){
    PalinString ps = (String s) ->{

      // String reverse = new StringBuilder(s).reverse().toString();
      // return (reverse.equals(s));
      
      //single line
      return new StringBuilder(s).reverse().toString().equals(s);
     
    };
    if(ps.checkPalin("aca")){
      System.out.println("palindrome");
    }else{
      System.out.println("not palindrome");
    }
  }
}
