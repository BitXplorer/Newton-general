import java.util.Scanner;


public class miniProjekt {

    public static intValidator(int validateInput) {
        while (!validateInput.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
            System.out.println("You didn't enter a valid integer!");
            Scanner input = new Scanner(System.in);
            System.out.print("Please add a integer as radius for the sphere: ");
        }
        if (validateInput.hasNextInt()) { //This will be used if the user has entered a correct Integer.
            int r = input.nextInt();
            double result = volume(r)
        }

    }



    public static double volume (int r){ //Method where we take in the value of the Radius to calculate the Sphere.
        double vol = (4*22*r*r*r)/(3*7);
        return vol;
    }

    public static int sum (int max) { //Method of calculating all Integers between 1 and Max value. For this we use a for loop.
        int total = 0;
        for (int i = 1; i <= max; i++){
            total += i;
        }
        return total;
    }
    public static int calcPoint (int k, int m, int x){
        int y = k * x + m;
        return y;

    }
    public static void main(String[] args) {
        boolean exitMenu = false; //Created this value so that we easily can see when the calculator will be closed.
        while (!exitMenu) { //In this loop the calculator will continue to pop up with until condition !exitMenu changes to true.

            Scanner mode = new Scanner(System.in);
            System.out.print("\n Calculate one of the following: \n 1. Calculate volume of a Sphere. \n 4. Add all integers. \n 5. calcPoint \n 0. Exit \n\n Please select a option between 1-5: ");

            if (mode.hasNextInt()) {
                int chosenMode = mode.nextInt();

                if (chosenMode == 1) { //If option 1 is chosen it will automatically add a scanner and default message.
                    Scanner input = new Scanner(System.in);
                    System.out.print("Please add a integer as radius for the sphere: ");

                    while (!input.hasNextInt()) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                        System.out.println("You didn't enter a valid integer!");
                        input = new Scanner(System.in);
                        System.out.print("Please add a integer as radius for the sphere: ");
                    }
                    if (input.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                        int r = input.nextInt();
                        double result = volume(r);
                        System.out.println("The volume of the sphere is: " + result + "\nTry something else: ");
                    }
                } else if (chosenMode == 4) {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Please add a integer of your choice: ");
                    while (!input.hasNextInt()) {
                        System.out.println("You didn't enter a valid integer!");
                        input = new Scanner(System.in);
                        System.out.print("Please add a integer of your choice: ");
                    }
                    if (input.hasNextInt()) {
                        int max = input.nextInt();
                        int result = sum(max);
                        System.out.print("All integers within the range 1 to " + max + " is " + result);
                    }
                } else if (chosenMode == 5) { //If option 1 is chosen it will automatically add a scanner and default message.
                    System.out.print("This option calculates the function value(y=kx+m). ");
                    Scanner inputK = new Scanner(System.in);
                    System.out.print("Please add a k variable: ");
                    Scanner inputX = new Scanner(System.in);
                    System.out.print("Please add a x variable: ");
                    Scanner inputM = new Scanner(System.in);
                    System.out.print("Please add a m variable: ");

                    while (!inputK.hasNextInt() || !inputX.hasNextInt() || !inputM.hasNextInt() ) { //If it's not an integer that is entered this will notice the user and start a new scanner.
                        System.out.println("You didn't enter a valid integer!");
                        inputK = new Scanner(System.in);
                        System.out.print("Please add a valid integer: ");
                    } if (inputK.hasNextInt()) { //This will be used if the user has entered a correct Integer.
                        int k = inputK.nextInt();


                    } if (inputX.hasNextInt()){
                        int x = inputX.nextInt();


                    } if (inputM.hasNextInt()) {
                        int m = inputM.nextInt();
                        int result = calcPoint(k, m, x);
                        System.out.println("The function value is: " + result);
                    }

                    } else if (chosenMode == 0) {
                    System.out.println("Thank you for using this calculator.");
                    exitMenu = true;
            }
        }
    }
}


