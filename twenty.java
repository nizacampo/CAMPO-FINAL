
/**
 * Write a description of class twenty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class twenty
{
    public static void main (String [] args){
        
        int[] arr12 = {10,22,35,40,18};
        for (int x : arr12) {
            if (x % 2 == 0 && x > 20) System.out.println(x);
        }
    }
}
