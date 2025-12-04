
/**
 * Write a description of class eigth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class eigth
{
    public static void main (String [] args){  
           int[] A = {10, 20, 30, 40, 50};
           int[] B = new int[A.length];

        
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
