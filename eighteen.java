
/**
 * Write a description of class eighteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class eighteen
{
    public static void main (String [] args){
         
        int[] arr11 = {3,5,7,3,9};
        boolean duplicate = false;
        for (int i = 0; i < arr11.length; i++) {
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i] == arr11[j]) {
                    duplicate = true;
                    break;
                }
            }
        }
        System.out.println("Duplicates: " + duplicate);
    }
}