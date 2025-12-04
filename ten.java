
/**
 * Write a description of class ten here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ten
{
    public static void main (String [] args){  
        System.out.println("First even index:");
        int[] arr6 = {3,5,9,8,2};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                System.out.println("Index = " + i);
                break;
            }
        }
   }
}