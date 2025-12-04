
/**
 * Write a description of class thirteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class thirteen
{
    public static void main (String [] args){
         
        int[] grades = {80,45,77,92,60};
        int pass = 0, fail = 0;
        for (int g : grades) {
            if (g > 75) pass++;
            else fail++;
        }
        System.out.println("Passed: " + pass );
         System.out.println( "Failed: " + fail);
    
   }
}