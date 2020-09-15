import java.util.Scanner;

public class miniProjekt {

    public static double volume (int r){
        double vol = (4*22*r*r*r)/(3*7);
        return vol;

    }

    public static int sum (int max) {
        int total = 0;
        for (int i = 1; i <= max; i++){
            total += i;

        }
        return total;
    }


    public static void main(String[] args) {
        boolean exitMenu = false;

        Scanner mode = new Scanner(System.in);

        while (!exitMenu) {
            System.out.print("\n Calculate one of the following: \n 1. Calculate volume of a Sphere \n 2. Add all integers. \n\n Please select a option: ");
            int chosenMode = mode.nextInt();


            if (chosenMode == 1) {
                Scanner input = new Scanner(System.in);
                System.out.print("Please add a radius for the sphere: ");
                int r = input.nextInt();
                exitMenu = false;
                double result = volume(r);

                System.out.println("The volume of the sphere is: " + result + "\nTry something else: ");

            } else if (chosenMode == 2) {
                Scanner input = new Scanner(System.in);
                System.out.print("Please add an integer of your choice: ");
                int max = input.nextInt();
                exitMenu = false;
                int result = sum(max);

                System.out.print("All integers within the range 0 to " + max + " is " + result);


            } else if (chosenMode == 0){
                System.out.println("Thank you for using this calculator.");
                exitMenu = true;
            } else {
                System.out.println("You have chosen a incorrect method. Please try again.");
            }
        }


    }
}
