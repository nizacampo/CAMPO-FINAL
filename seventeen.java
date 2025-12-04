
/**
 * Write a description of class seventeen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class seventeen
{
    public static void main (String [] args){
        int[] arr10 = {12,45,7,30,28};
        int highest = arr10[0], second = arr10[0];
        for (int x : arr10) {
            if (x > highest) {
                second = highest;
                highest = x;
            } else if (x > second && x != highest) {
                second = x;
            }
        }
        System.out.println("Second highest = " + second);
    }
}