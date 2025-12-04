
/**
 * Write a description of class nine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class nine
{
    public static void main (String [] args){  
     
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextInt();
            total += num;
        } while (num != 0);

        
        total -= 0; 
        System.out.println("The sum is: " + total);
    }
}

