
/**
 * Write a description of class two here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class two
{
    public static void main(String [] args){
        
     System.out.println(" Count how many times 7 appears:");
        int[] arr1 = {7,3,7,5,7,2,1,7,4,7};
        int count7 = 0;
        for (int x : arr1) {
            if (x == 7) count7++;
        }
        System.out.println("7 appears " + count7 + " times");

         
  }
}