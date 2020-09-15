import java.util.Scanner;
import javax.swing.JOptionPane;
public class day3PExercises {

    public static void main(String []args){
        /*
        //P3.1
        int x = -1;

        if (x==0) {
            System.out.println("X is equal to 0");
        } else if (x>0){
            System.out.println("X is positive");
        } else if (x<0) {
            System.out.println("X is negative");
        }

         */
        /*
        //P3.2
        String input1 = JOptionPane.showInputDialog("Ange ett nummer mellan -100000 och 100000 ");
        double nr = Double.valueOf(input1);

        if (nr==0) {
            System.out.println("X is equal to 0 and small");
        }  else if (nr<1 && nr!=0){
            System.out.println("X is positive and small");
        } else if (nr<0) {
            System.out.println("X is negative and small");
        } else if (nr>0 && nr>100000){
            System.out.println("X is positive and large.");
        }else if (nr>0){
            System.out.println("X is positive");
        }

         */

                //P3.3
        /*
        Scanner nr = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrInvalue = nr.nextInt();

        if (nrInvalue<0) {
            nrInvalue = nrInvalue*-1;
        }

        if (nrInvalue<10){
            System.out.println("The number have 1 digit.");
        } else if (nrInvalue < 100 && nrInvalue > 10){
            System.out.println("The number have 2 digits.");
        } else if (nrInvalue < 1000 && nrInvalue > 100){
            System.out.println("The number have 3 digits.");
        } else if (nrInvalue < 10000 && nrInvalue > 1000){
            System.out.println("The number have 4 digits.");
        } else if (nrInvalue < 100000 && nrInvalue > 10000){
            System.out.println("The number have 5 digits.");
        }
         */
                //P3.4
        /*
        Scanner nr1 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrOne = nr1.nextInt();
        Scanner nr2 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrTwo = nr2.nextInt();
        Scanner nr3 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrThree = nr3.nextInt();

        if (nrOne == nrThree && nrThree == nrTwo){
            System.out.println("All the same.");
        } else if (nrOne != nrTwo && nrThree != nrTwo){
            System.out.println("No one is the same");
        } else if (nrOne ==nrTwo || nrTwo == nrThree){
            System.out.println("Neither");
        }

         */

                //P3.5 P3.6
        /*
        Scanner mode = new Scanner(System.in);
        System.out.print("Ange lenient eller strict: ");
        String chosenMode = mode.next();

        Scanner nr1 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrOne = nr1.nextInt();
        Scanner nr2 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrTwo = nr2.nextInt();
        Scanner nr3 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrThree = nr3.nextInt();


             if (chosenMode.equals("strict")) {
              if (nrOne < nrTwo && nrTwo < nrThree) {
                System.out.println("Strict increasing");
            } else if (nrOne > nrTwo && nrTwo > nrThree) {
                System.out.println("Strict decreasing");
            }else {
                System.out.println("Neither1");
            }
            }

             if (chosenMode.equals("lenient")) {
              if (nrOne <= nrTwo && nrTwo <= nrThree) {
                     System.out.println("Lenient increasing");
                 } else if (nrOne >= nrTwo && nrTwo >= nrThree) {
                     System.out.println("Lenient decreasing");
                 } else {
                     System.out.println("Neither");
                 }
             }

         */
            //P3.7
        /*
        Scanner mode = new Scanner(System.in);

        Scanner nr1 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrOne = nr1.nextInt();
        Scanner nr2 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrTwo = nr2.nextInt();
        Scanner nr3 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrThree = nr3.nextInt();

        if (nrOne < nrTwo && nrTwo < nrThree) {
            System.out.println( nrOne + " " + nrTwo + " " + nrThree + " In order");
        } else if (nrOne > nrTwo && nrTwo > nrThree) {
            System.out.println(nrOne + " " + nrTwo + " " + nrThree + " In order");
        } else {
            System.out.println(nrOne + " " + nrTwo + " " + nrThree + " Not in order");
        }
         */

        //P3.8
        /*
        Scanner mode = new Scanner(System.in);

        Scanner nr1 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrOne = nr1.nextInt();
        Scanner nr2 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrTwo = nr2.nextInt();
        Scanner nr3 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrThree = nr3.nextInt();
        Scanner nr4 = new Scanner(System.in);
        System.out.print("Ange ett nr: ");
        int nrFour = nr4.nextInt();

        if (nrOne == nrTwo && nrThree == nrFour) {
            System.out.println( nrOne + " " + nrTwo + " " + nrThree + " " + nrFour + " Two Pairs");
        } else if (nrThree == nrTwo && nrOne == nrFour) {
            System.out.println(nrOne + " " + nrTwo + " " + nrThree + " " + nrFour + " Two Pairs");
        } else if (nrThree == nrOne && nrTwo == nrFour) {
            System.out.println(nrOne + " " + nrTwo + " " + nrThree + " " + nrFour + " Two Pairs");
        } else {
            System.out.println(nrOne + " " + nrTwo + " " + nrThree + " " + nrFour + " not two pairs");
        }
        
         */

        //TODO P3.9 (sen P3.10 och P3.11 i samma), Vill kunna ta ut siffror och char ur samma String input och converta.
        /*

        Scanner input = new Scanner(System.in);
        System.out.print("Please add a temperature in Celsius or Fahrenheit: ");
        String temperature = input.nextLine();
        double degrees = temperature.toString() temperature/ 10);
        char scale = temperature.charAt(temperature.length() -1);
        String state = " ";

        if (scale == 'C') {
            if (degrees <= 99 && degrees >= 1) {
                state = "liquid";
                System.out.println("The temperature " + temperature + " is in a " + state + " state." );
            } else if (degrees >= 100) {
                state = "gas";
                System.out.println("The temperature " + temperature + " is in a " + state + " state." );
            } else if (degrees <= 1) {
                state = "solid";
                System.out.println("The temperature " + temperature + " is in a " + state + " state." );
            }
        }

        if (scale == 'F') {
            if (degrees <= 211 && degrees >= 33) {
                state = "liquid";
                System.out.println("The temperature " + temperature + " is in a " + state + " state." );
            } else if (degrees >= 212) {
                state = "gas";
                System.out.println("The temperature " + temperature + " is in a " + state + " state." );
            } else if (degrees <= 32) {
                state = "solid";
                System.out.println("The temperature " + temperature + " is in a " + state + " state." );
            }
        }

         */

        // P3.12
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a letter Grade: ");
        String grade = input.next();
        char posNeg = grade.charAt(1);
        char letter = grade.charAt(0);
        double number = 0;
        double numeric = 0;


        if (letter == 'A') {
            number = 4;
        } else if (letter == 'B') {
            number = 3;
        } else if (letter == 'C') {
            number = 2;
        } else if (letter == 'D') {
            number = 1;
        } else if (letter == 'F') {
            number = 0;
        }

        if (posNeg == '+' && letter == 'A') {
            numeric = number;
        }else if (posNeg == '+') {
            numeric = number + .3;
        } else if (posNeg == '-') {
            numeric = number - .3;
        }
        System.out.println("The numeric value is "+ numeric);
        
         */




                //P4.2
                /*
                Scanner in = new Scanner(System.in);
                int input = 0;
                int max;
                int min;
                int even = 0;
                int odd = 0;
                int sum = 0;
                int lastValue = 0;
                input = in.nextInt();
                lastValue = input;
                max = input;
                min = input;
                sum = input;
                String cVal = Integer.toString(sum);
                String adjacent = "";

                if (input%2 ==0){
                    even++;
                }else {
                    odd++;
                }

                while ( in.hasNextInt()){
                    input = in.nextInt();

                    if (input > max){
                        max = input;

                    }
                    if (input < min) {
                        min = input;
                    }
                    if (input%2 ==0){
                        even++;
                    }else {
                        odd++;
                    }

                    sum += input;
                    cVal += " "+ Integer.toString(sum);
                }
                if (input == lastValue) {
                    adjacent += " " + Integer.toString(input);
                } else {
                    lastValue = input;
                }

                System.out.println("Max = " + max + " och min = " + min + ", jämna tal: " + even + " och ojämna tal: " + odd);
                System.out.println(cVal);
                System.out.println(adjacent);

                 */



    }
}
