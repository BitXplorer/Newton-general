import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class moreArrays {

    public static int menuInput() { //Method for validating menu input to be relevant to options in menu.
        Scanner input = new Scanner(System.in);
        int validated = 0;
        boolean isValid = false;
        do {
            if (!input.hasNextInt()) {
                input.next();
                System.out.print("You have entered a incorrect value. Please enter a valid option: ");
                isValid = false;
            } else if (input.hasNextInt()) {
                validated = input.nextInt();
                if (validated < 0 || validated > 10) {
                    isValid = false;
                    System.out.print("You have entered a incorrect value. Please enter a valid option: ");
                } else {
                    isValid = true;
                }
            }
        } while (!isValid); {
        }
        return validated;
    }
    public static void sumWithoutSmallest(int[] input) {
        int smallest = input[0];
        int sum = 0;
        System.out.println("This is the original input: " + Arrays.toString(input));
        for (int i = 1; i < input.length; i++) {
            sum = input[i] + sum;
            if (input[i] < smallest) {
                smallest = input[i];
            }
        }
        sum = sum -smallest+input[0];
        System.out.println("Sum except smallest value.: " + sum);
    }
    public static void reversedArray(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));
            int len = input.length;
            int[] result = new int[len];
            for (int i = len; i > 0 ; i--) {
                result[len - i] = input[i - 1];
            }

        System.out.println("Reversed order: " + Arrays.toString(result));
    }
    public static void swapFirstAndSecondHalf(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));
        int[] first = new int[input.length/2];
        int[] second = new int[input.length/2];
        for (int i= 0; i<input.length/2 -1; i++)
        {
            first[i] = input[i];
        }
        for (int i= input.length/2; i<input.length; i++)
        {
            second[i] = input[i];
        }

        System.out.println("Swapped first and second half of array: " + Arrays.toString(second) + Arrays.toString(first));
    }

    public static void main(String[] args) {
        boolean exitMenu = false;

        while (!exitMenu){
            System.out.print("\n Choose what to do with your inputs: \n 1. Add all input into a sum except smallest value. " +
                    "\n 2. Reverse the order in the array." +
                    "\n 3. Swap first and second half of an array. " +
                    "\n 4. Replace each element except the first and last by the larger of its two neighbours. " +
                    "\n 5. Remove the middle element(s). " +
                    "\n 6. Move all even elements to the front. " +
                    "\n 7. Return the second-largest element. " +
                    "\n 8. Check if array is sorted increasingly. " +
                    "\n 9. Check if array contains two adjacent duplicates. " +
                    "\n 10. Check if array contains duplicate elements. " +
                    "\n 0. Exit " +
                    "\n\n Please select one of the options above: ");

            int chosenMode = menuInput();
            Scanner in = new Scanner(System.in);
            int arraySize = 6;
            int[] input = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                System.out.print("Please add an integer: ");
                input[i] = in.nextInt();
            }

            if (chosenMode == 1) {
                sumWithoutSmallest(input);

            } else if (chosenMode == 2) {
                reversedArray(input);

            } else if (chosenMode == 3) {
                swapFirstAndSecondHalf(input);

            }/* else if (chosenMode == 4) {
                method4(input);

            } else if (chosenMode == 5) {
                method5(input,arraySize);

            } else if (chosenMode == 6) {
                method6(input);

            }  else if (chosenMode == 7) {
                method7(input);

            }  else if (chosenMode == 8) {
                method8(input);

            } else if (chosenMode == 9) {
                method9(input);

            }  else if (chosenMode == 10) {
                method10(input);

            } */ else if (chosenMode == 0) {
                System.out.println("Thank you for using this calculator.");
                exitMenu = true;
            }
        }
    }
}
