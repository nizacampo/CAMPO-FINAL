
/**
 * Write a description of class six here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class six
{
    public static void main (String [] args){ 
          
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0, count = 0;

        System.out.print("Odd numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                sum += num;
                count++;
            }
        }

        double average = count > 0 ? (double) sum / count : 0;
        System.out.println("\nAverage of odd numbers: " + average);
    }
}
    