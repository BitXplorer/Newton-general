import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class sept28Arrayer {

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

    public static void method1(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));
        int temp = input[0];
        input[0] = input[4];
        input[4] = temp;

        System.out.println("The first and last elements swapped: " + Arrays.toString(input));
    }
    public static void method2(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));
        int temp = input[4];
        for (int i = input.length-1; i > 0 ; i--){
            input[i] = input[i - 1];
            }
        input[0] = temp;

        System.out.println("All shifted one step to the right with the last one as first: " + Arrays.toString(input));
    }
    public static void method3(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));

        for(int  i = input.length -1; i >= 0; i--) {//loop for iterate from 1 to maximum
            if (input[i] % 2 == 0) {//using modular operator for finding even numbers
                input[i] = 0;
            }
        }
        System.out.println("All even elements replaced with 0: " + Arrays.toString(input));
    }
    public static void method4(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));

        int[] ret = new int[input.length];
        for (int i = 0; i < input.length; ++i) {
            if (i == 0 || i == input.length - 1) {
                ret[i] = input[i];
            } else {
                ret[i] = Math.max(input[i-1], input[i+1]);
            }
        }
        System.out.println("All elements replaced with the larger of its neighbours (except first and last): " + Arrays.toString(ret));
    }
    public static void method5(int[] input, int arraySize) {
        System.out.println("This is the original input: " + Arrays.toString(input));
        int arrayCopy[];
        if (arraySize % 2 ==0) {
            arrayCopy = new int[arraySize-2];
            for (int i = 0; i < (arrayCopy.length/2); i++) {
                arrayCopy[i] = input[i];
            }
            for (int i = (arrayCopy.length/2); i < arrayCopy.length; i++) {
                arrayCopy[i] = input[i+2];
            }
        } else {
            arrayCopy = new int[arraySize-1];
            for(int i = 0; i < (arrayCopy.length/2); i++) {
                arrayCopy[i] = input[i];
            }
            for (int i = (arrayCopy.length/2); i < arrayCopy.length; i++) {
                arrayCopy[i] = input[i+1];
            }
        }
        System.out.println("The middle elements removed: " + Arrays.toString(arrayCopy));
    }
    public static void method6(int[] input) {
        System.out.println("This is the original input: " + Arrays.toString(input));
        int temp=0;
        int a=0;
        for(int i = 0 ; i<input.length ;i++){
            if(input[i] % 2 == 0){
                for (int j = i; j > a; j--){
                    temp=input[j-1];
                    input[j-1]=input[j];
                    input[j]=temp;
                }
                a++;
            }
        }
        System.out.println("All even elements in the front: " + Arrays.toString(input));
    }
    public static void method7(int[] input) {
        int largest = input[0];
        int secondLargest = 0;
        System.out.println("This is the original input: " + Arrays.toString(input));
        for (int i = 1; i < input.length; i++) {
            if (input[i] > largest) {
                secondLargest = largest;
                largest = input[i];
            } else if (input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }
        System.out.println("The second largest element: " + secondLargest);
    }
    public static void method8(int[] input) {
        boolean increasingOrder = true;
        int previousArrayIndex = input[0];
        System.out.println("This is the original input: " + Arrays.toString(input));
        for (int i = 1; i < input.length; i++) {
            if (input[i] < previousArrayIndex) {
                increasingOrder = false;
                break;
            } else if (previousArrayIndex < input[i]){
                previousArrayIndex = input[i];
            }
        }
        System.out.println("Is the array in increasing order: " + increasingOrder);
    }
    public static void method9(int[] input) {
        boolean adjacentDuplicate = false;
        int previousArrayIndex = input[0];
        System.out.println("This is the original input: " + Arrays.toString(input));
        for (int i = 1; i < input.length; i++) {
            if (input[i] == previousArrayIndex) {
                adjacentDuplicate = true;
                break;
            } else if (previousArrayIndex != input[i]){
                previousArrayIndex = input[i];
            }
        }
        System.out.println("Is there adjacent duplicates: " + adjacentDuplicate);
    }

    public static void method10(int[] input) {
        boolean adjacentDuplicate = false;
        int previousArrayIndex = input[0];
        System.out.println("This is the original input: " + Arrays.toString(input));

        for (int i = 1; i < input.length; i++) {
            if (input[i] == previousArrayIndex) {
                adjacentDuplicate = true;
            } else if (previousArrayIndex != input[i]){
                previousArrayIndex = input[i];
            }
        }
        System.out.println("Is there adjacent duplicates: " + adjacentDuplicate);
    }



    public static void main(String[] args) {


/*      //P6.1
        Scanner in = new Scanner(System.in);
        int[] input = new int[10];

        for (int i = 0; i<input.length ; i++){
            System.out.print("Please add an integer: ");
            input[i] = in.nextInt();

        }

        System.out.println("Every element at even index:\n " + input[0] + " " + input[2] + " " + input[4] + " " + input[6] + " " + input[8] + " " );
        System.out.println("Every even element: ");
        for(int  i = input.length -1; i >= 0; i--) {//loop for iterate from 1 to maximum
            if (input[i] % 2 == 0) {//using modular operator for finding even numbers
                System.out.print(input[i] + ", ");
            }
        }

        System.out.println("Every element in reverse order: ");
        for (int  i = input.length -1; i >= 0; i--) {//loop for iterate from 1 to maximum
            System.out.print(input[i] + ", ");

        }
        System.out.println("First and last element:\n " + input[0] + " " + input[9]);

 */
        //P6.2
        boolean exitMenu = false;

        while (!exitMenu){
            System.out.print("\n Choose what to do with your inputs: \n 1. Swap first and last input. " +
                    "\n 2. Swap all input to the right, with the last going to number one." +
                    "\n 3. Replace all even elements with 0. " +
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
                method1(input);

            } else if (chosenMode == 2) {
                method2(input);

            }  else if (chosenMode == 3) {
                method3(input);

            }else if (chosenMode == 4) {
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

            }  else if (chosenMode == 0) {
                System.out.println("Thank you for using this calculator.");
                exitMenu = true;
            }
        }





    }
}
