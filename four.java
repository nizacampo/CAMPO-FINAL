
/**
 * Write a description of class four here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class four
{
    public static void main (String [] args){
                
        int[] arr = {12, 5, 3, 19, 7};

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}

    
    