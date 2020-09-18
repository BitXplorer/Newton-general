import java.util.Scanner;

public class miniProjekt {

    public static double volume (int r){ //Method where we take in the value of the Radius to calculate the Sphere.
        double vol = (4*22*r*r*r)/(3*7); //This is the formula to calculate the Volume.
        return vol;

    }

    public static int sum (int max) { //Method of calculating all Integers between 1 and Max value. For this we use a for loop.
        int total = 0;
        for (int i = 1; i <= max; i++){
            total += i;

        }
        return total;
    }


    public static void main(String[] args) {
        boolean exitMenu = false; //Created this value so that we easily can see when the calculator will be closed.

        while (!exitMenu) { //In this loop the calculator will continue to pop up with until condition !exitMenu changes to true.
            Scanner mode = new Scanner(System.in);
            System.out.print("\n Calculate one of the following: \n 1. Calculate volume of a Sphere. \n 2. Add all integers. \n\n Please select a option: ");
            int chosenMode = mode.nextInt();

            if (mode.hasNextInt() && chosenMode <=2 && chosenMode >=1) {

                    if (chosenMode == 1) { //If option 1 is chosen it will automatically add a scanner and default message.
                        Scanner input = new Scanner(System.in);
                        System.out.print("Please add a integer as radius for the sphere: ");

                        while (!input.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                            System.out.println(" You didn't enter a valid integer!");
                            input = new Scanner(System.in);
                            System.out.print("\n Please add a integer as radius for the sphere: ");
                        }
                        if (input.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                            int r = input.nextInt();
                            double result = volume(r);
                            System.out.println("\n The volume of the sphere is: " + result + "\nTry something else: ");
                        }

                    } else if (chosenMode == 2) { //If option 2 is chosen it will automatically add a scanner and default message.
                        Scanner input = new Scanner(System.in);
                        System.out.print(" Please add a integer of your choice: ");

                        while (!input.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                            System.out.println(" You didn't enter a valid integer!");
                            input = new Scanner(System.in);
                            System.out.print("\n Please add a integer of your choice: ");
                        }
                        if (input.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                            int max = input.nextInt();
                            int result = sum(max);
                            System.out.print("\n All integers within the range 1 to " + max + " is " + result);

                        }
                    } else if (chosenMode == 0) { // If the user adds 0 to quit the calculator we'll change exitMenu value which is the foundation for the while loop this is built on.
                        System.out.println("Thank you for using this calculator.");
                        exitMenu = true;
                    }

            }  else if (chosenMode >=3 || chosenMode <=0 ) { // This makes incorrect menu input to start the loop over and notify the user about it.
                System.out.println("Incorrect value selected. Please try again: ");

            }
        }



    }
}
