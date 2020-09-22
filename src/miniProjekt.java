import java.util.Scanner;
/*
public class miniProjekt {

    public static double volume (int r){ //Method where we take in the value of the Radius to calculate the Sphere.
        double vol = (4*22*r*r*r)/(3*7);
        return vol;
    }

    public static double volume( int r, int h) { // Methord where we count the volume of a straight cylinder. ( V = π*r*r*h )
            double vol = (3.14*r*r*h);
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
            int r,h,m,numerator,max,x;

            Scanner input = new Scanner(System.in);
            System.out.print("\n Calculate one of the following: \n 1. Calculate volume of a Sphere. \n 2. Calculate the volume of a cylinder. \n 4. Add all integers. \n 0. Exit \n\n Please select one of the options above: ");


            if (input.hasNextInt()) {
                int chosenMode = input.nextInt();

                if (chosenMode == 1) { //If option 1 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add a integer as radius for the sphere: ");
                    r = input.nextInt();

                    while (!input.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                        System.out.println("You didn't enter a valid integer!");
                        r = input.nextInt();
                        System.out.print("Please add a integer as radius for the sphere: ");
                    }
                    if (input.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                        double result = volume(r);
                        System.out.println("The volume of the sphere is: " + result + "\nTry something else: ");
                    }
                } else if (chosenMode == 2) { //If option 2 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add a radius as an integer of your choice: ");
                    r = input.nextInt();
                    System.out.print("Please add a height as an integer of your choice: ");
                    h = input.nextInt();

                    while (!input.hasNextInt() || !input.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                        System.out.print("Please add a radius as an integer of your choice: ");
                        r = input.nextInt();
                        System.out.print("Please add a height as an integer of your choice: ");
                        h = input.nextInt();

                    } if (input.hasNextInt() && input.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                        double result = volume(r,h);
                        System.out.print("The volume of the cylinder is: " + result);

                    }

                } else if (chosenMode == 4) { //If option 2 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add a integer of your choice: ");
                    max = input.nextInt();

                    while (!input.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                        System.out.println("You didn't enter a valid integer!");
                        max = input.nextInt();
                        System.out.print("Please add a integer of your choice: ");
                    }
                    if (input.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                        double result = sum(max);
                        System.out.print("All integers within the range 1 to " + max + " is " + result);
                    }
                } else if (chosenMode == 0) { // If the user adds 0 to quit the calculator we'll change exitMenu value which is the foundation for the while loop this is built on.
                    System.out.println("Thank you for using this calculator.");
                    exitMenu = true;
                }
            }
        }
    }
}

 */


