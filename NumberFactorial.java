/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class NumberFactorial {

    public static void main(String[] args){
      System.out.println("Enter a number");
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
     
      int factorial = number;
      
      for(int i = (number - 1); i > 1; i--) {
         factorial = factorial * i;
      } 
      System.out.println("Factorial of " + number +  " is " + factorial);
   }
}
        
        
       

    

