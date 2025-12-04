
/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class seven
{
    public static void main (String [] args){  
    
        int[] numbers = {-5, 2, -3, 7, -1};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(numbers[i]);
        }
        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


