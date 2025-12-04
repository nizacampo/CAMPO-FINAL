
/**
 * Write a description of class twelve here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class twelve
{
    public static void main (String [] args){
         
        int[] arr8 = {4,2,4,7,4,9};
        int val = 4, c = 0;
        for (int x : arr8) if (x == val) c++;
        System.out.println(c >= 3);
   }
}