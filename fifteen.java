
/**
 * Write a description of class fifteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class fifteen
{
    public static void main (String [] args){
       
        Scanner s = new Scanner(System.in);
        int n;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            n = s.nextInt();
            if (n > 50)
                System.out.println(n);
        }
    }
}

        
   
