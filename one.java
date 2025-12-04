
/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class one
{
     public static void main(String [] args){
       Scanner input = new Scanner(System.in);

        
        System.out.println(" Enter number between 1 and 100:");
        int num = 0;
        while (num < 1 || num > 100) {
            num = input.nextInt();
        }      
        
   
    }
}