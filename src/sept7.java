import javax.swing.JOptionPane;
import  java.util.Scanner;

public class sept7 {

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

        //P3.5
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

        if (chosenMode == "strict") {


            if (nrOne < nrTwo && nrTwo < nrThree) {
                System.out.println("Increasing");
            } else if (nrOne > nrTwo && nrTwo > nrThree) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }

        } else if (chosenMode == "lenient") {



                if (nrOne <= nrTwo && nrTwo <= nrThree){
                    System.out.println("Increasing");
                } else if (nrOne >= nrTwo && nrTwo >= nrThree){
                    System.out.println("Decreasing");
                } else {
                    System.out.println("Neither");

                }

            }

         */


            //P3.15
            Scanner input = new Scanner(System.in);
            System.out.print("Ange tre nr: ");
            double numbers = input.nextDouble();
            double numberOne = numbers % 100;
            double numberTwo = numbers / 100;
            double numberThree = numbers % 10;

            System.out.print(numbers);

            //Testar











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


