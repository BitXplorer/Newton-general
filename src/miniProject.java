import java.util.Scanner;

public class miniProject {

    public static int menuInput() {
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
                if (validated < 0 || validated > 5) {
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

    public static int getNewInt() {
        Scanner input = new Scanner(System.in);
        int validated = 0;
        boolean isValid;
        do {
            if (!input.hasNextInt()) {
                System.out.print("You have entered a incorrect value. Please enter a valid Integer: ");
                isValid = false;
                input.next();
            } else {
                isValid = true;
                validated = input.nextInt();
            }
        } while (!isValid); {
        }
        return validated;
    }

        public static double volume (int r){ //Method where we take in the value of the Radius to calculate the Sphere.
            double vol = (4*22*r*r*r)/(3*7);
            return vol;
        }

        public static double volume( int r, int h) { // Method where we count the volume of a straight cylinder. ( V = π*r*r*h )
            double vol = (3.14*r*r*h);
            return vol;

        }
        public static String fraction( int numerator, int denominator) { // Method where we count the volume of a straight cylinder. ( V = π*r*r*h )
        int result = numerator / denominator;
        String resultString = Integer.toString(result);
        return resultString;

        }
        public static int calcPoint( int k, int m, int x) { // Method where we count the volume of a straight cylinder. ( V = π*r*r*h )
        int y = k * x + m;
        return y;

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
            int r,h,m,k,numerator,denominator,max,x,chosenMode;

            while (!exitMenu){
                System.out.print("\n Calculate one of the following: \n 1. Calculate volume of a Sphere. \n 2. Calculate the volume of a cylinder.\n 3. Calculate fraction. \n 4. Add all integers. \n 5. Calculate the functional value (y=kx+m). \n 0. Exit \n\n Please select one of the options above: ");
                chosenMode = menuInput();

                if (chosenMode == 1) { //If option 1 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add a radius as an integer of your choice: ");
                    r = getNewInt();
                    double result = volume(r);
                    System.out.println("The volume of the sphere is: " + result + "\nTry something else: ");

                } else if (chosenMode == 2) { //If option 2 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add a radius as an integer of your choice: ");
                    r = getNewInt();
                    System.out.print("Please add a height as an integer of your choice: ");
                    h = getNewInt();
                    double result = volume(r,h);
                    System.out.println("The volume of the cylinder is: " + result);

                } else if (chosenMode == 3) { //If option 2 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add a numerator as an integer of your choice: ");
                    numerator = getNewInt();
                    System.out.print("Please add a denominator as an integer of your choice: ");
                    denominator = getNewInt();
                    String result = fraction(numerator,denominator);
                    System.out.println("The result of " + numerator +"/" + denominator + " is: " + result);


                } else if (chosenMode == 4) { //If option 2 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add an integer of your choice: ");
                    max = getNewInt();
                    int result = sum(max);
                    System.out.print("All integers within the range 1 to " + max + " is " + result);


                } else if (chosenMode == 5) { //If option 2 is chosen it will automatically add a scanner and default message.
                    System.out.print("Please add value k as an integer of your choice: ");
                    k = getNewInt();
                    System.out.print("Please add value x as an integer of your choice: ");
                    x = getNewInt();
                    System.out.print("Please add value m as an integer of your choice: ");
                    m = getNewInt();
                    int result = calcPoint(k,m,x);
                    System.out.println("The result of " + k +"*" + x + "+" + m + " is: " + result);


                } else if (chosenMode == 0) { // If the user adds 0 to quit the calculator we'll change exitMenu value which is the foundation for the while loop this is built on.
            System.out.println("Thank you for using this calculator.");
            exitMenu = true;
        }
            }

    }
}

