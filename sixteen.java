
/**
 * Write a description of class sixteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class sixteen
{
    public static void main (String [] args){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = s.next();   

        if (num.charAt(0) == '-') {
            System.out.println(num.length() - 1);   
        } else {
            System.out.println(num.length());
        }
    }
}

        
      