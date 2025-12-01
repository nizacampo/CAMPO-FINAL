
/**
 * Write a description of class campo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class campo
{
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);

         //1. Ask user for a number 1–100
        System.out.println("\n1. Enter number between 1 and 100:");
        int num = 0;
        while (num < 1 || num > 100) {
            num = input.nextInt();
        }      
        
        //2. Count how many times 7 appears
        System.out.println("\n2. Count how many times 7 appears:");
        int[] arr1 = {7,3,7,5,7,2,1,7,4,7};
        int count7 = 0;
        for (int x : arr1) {
            if (x == 7) count7++;
        }
        System.out.println("7 appears " + count7 + " times");

         //3. Star triangle pattern
        System.out.println("\n3. Star triangle:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }

         //4. Smallest and largest in array
        System.out.println("\n4. Smallest and largest:");
        int[] arr2 = {5,9,1,7,3};
        int small = arr2[0], large = arr2[0];
        for (int x : arr2) {
            if (x < small) small = x;
            if (x > large) large = x;
        }
        System.out.println("Smallest: " + small + " Largest: " + large);
        
        //5. Stop loop when found
        System.out.println("\n5. Stop when found:");
        int[] arr3 = {3,8,12,5,9};
        int target = 12;
        for (int x : arr3) {
            if (x == target) {
                System.out.println("Found: " + x);
                break;
            }
        }

         //6. Average of odd numbers
        System.out.println("\n6. Average of odd numbers:");
        int[] arr4 = {3,8,11,4,9};
        int sumOdd = 0, countOdd = 0;
        for (int x : arr4) {
            if (x % 2 != 0) {
                sumOdd += x;
                countOdd++;
            }
        }
        System.out.println("Average = " + (sumOdd / countOdd));

        // 7. Convert negatives to positives
        System.out.println("\n7. Convert negatives:");
        int[] arr5 = {-5, 3, -9, 7};
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < 0) arr5[i] = -arr5[i];
        }
        for (int x : arr5) System.out.print(x + " ");
        System.out.println();

         //8. Copy array
        System.out.println("\n8. Copy array:");
        int[] A = {1,2,3,4};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) B[i] = A[i];
        for (int x : B) System.out.print(x + " ");
        System.out.println();

         //9. Keep adding until 0
        System.out.println("\n9. Keep adding until 0:");
        int total = 0, n = -1;
        while (n != 0) {
            n = input.nextInt();
            total += n;
        }
        System.out.println("Sum = " + total);

         //10. First even index
        System.out.println("\n10. First even index:");
        int[] arr6 = {3,5,9,8,2};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                System.out.println("Index = " + i);
                break;
            }
        }

        // 11. Even index elements
        System.out.println("\n11. Even index elements:");
        int[] arr7 = {10,20,30,40,50};
        for (int i = 0; i < arr7.length; i += 2) {
            System.out.println(arr7[i]);
        }

         //12. Check if value appears 3 times
        System.out.println("\n12. Appears at least 3 times?");
        int[] arr8 = {4,2,4,7,4,9};
        int val = 4, c = 0;
        for (int x : arr8) if (x == val) c++;
        System.out.println(c >= 3);

         //13. Passed and failed
        System.out.println("\n13. Passed and failed:");
        int[] grades = {80,45,77,92,60};
        int pass = 0, fail = 0;
        for (int g : grades) {
            if (g > 75) pass++;
            else fail++;
        }
        System.out.println("Passed: " + pass + " Failed: " + fail);

         //14. Reverse array
        System.out.println("\n14. Reverse array:");
        int[] arr9 = {1,2,3,4,5};
        for (int i = arr9.length - 1; i >= 0; i--) {
            System.out.println(arr9[i]);
        }

        //15. Input 5 numbers, show > 50
        System.out.println("\n15. Numbers > 50:");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) nums[i] = input.nextInt();
        for (int x : nums) if (x > 50) System.out.println(x);

         //16. Count digits
        System.out.println("\n16. Count digits:");
        int number = input.nextInt();
        int digits = String.valueOf(Math.abs(number)).length();
        System.out.println("Digits: " + digits);

         //17. Second highest
        System.out.println("\n17. Second highest:");
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

         //18. Check duplicates
        System.out.println("\n18. Contains duplicates?");
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

        //19. Match names to grades
        System.out.println("\n19. Names and grades:");
        String[] names = {"Ali","Sara","John"};
        int[] marks = {88,92,75};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + marks[i]);
        }

        //20. Even numbers > 20
        System.out.println("\n20. Even numbers > 20:");
        int[] arr12 = {10,22,35,40,18};
        for (int x : arr12) {
            if (x % 2 == 0 && x > 20) System.out.println(x);
        }

        System.out.println("\n=== END OF PROGRAM ===");

    }
}